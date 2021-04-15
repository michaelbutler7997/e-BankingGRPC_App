from concurrent import futures
from zeroconf import IPVersion, ServiceInfo, Zeroconf
from jproperties import Properties
import logging
import grpc
import socket
import queue
import sys
import payment_pb2
import payment_pb2_grpc


class Payment(payment_pb2_grpc.GreeterServicer):

    def paymentAmount(self, request, context):
        return payment_pb2.paymentAmountReply(rAmount = request.amount)

    def paymentDate(self, request, context):
        return payment_pb2.paymentDateReply(rDate = request.date)


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    payment_pb2_grpc.add_GreeterServicer_to_server(Payment(), server)
    server.add_insecure_port('[::]:50053')
    server.start()
    server.wait_for_termination()

def paymentProperties():
    configs = Properties()
    with open('payment.properties', 'rb')as config_file:
        configs.load(config_file)
    print('Service properties')
    print(configs.get("payment_service_type"))
    print(configs.get("payment_service_name"))
    print(configs.get("payment_service_description"))
    print(configs.get("payment_service_port"))

def paymentRegister():

    host_ip = socket.gethostbyname(socket.gethostname())
    print(host_ip)
    global zeroconf
    desc = {'path': 'payment.properties'}
    info = ServiceInfo("_http._tcp.local.", "payment._http._tcp.local.", addresses=[socket.inet_aton(host_ip)], port=50053, properties=desc,server="rental.local.")
    print(info)
    z = Zeroconf()
    z.register_service(info)
    print('registering rental service ...')


if __name__ == '__main__':
    logging.basicConfig()
    paymentProperties()
    paymentRegister()
    serve()


from concurrent import futures
import logging
import grpc
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

if __name__ == '__main__':
    logging.basicConfig()
    serve()
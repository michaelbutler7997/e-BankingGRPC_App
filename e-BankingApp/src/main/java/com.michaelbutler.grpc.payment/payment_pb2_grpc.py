# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import payment_pb2 as payment__pb2


class GreeterStub(object):
    """The greeting service definition.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.paymentAmount = channel.unary_unary(
                '/com.michaelbutler.grpc.payment.Greeter/paymentAmount',
                request_serializer=payment__pb2.paymentAmountRequest.SerializeToString,
                response_deserializer=payment__pb2.paymentAmountReply.FromString,
                )
        self.paymentDate = channel.unary_unary(
                '/com.michaelbutler.grpc.payment.Greeter/paymentDate',
                request_serializer=payment__pb2.paymentDateRequest.SerializeToString,
                response_deserializer=payment__pb2.paymentDateReply.FromString,
                )


class GreeterServicer(object):
    """The greeting service definition.
    """

    def paymentAmount(self, request, context):
        """Sends a greeting
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def paymentDate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_GreeterServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'paymentAmount': grpc.unary_unary_rpc_method_handler(
                    servicer.paymentAmount,
                    request_deserializer=payment__pb2.paymentAmountRequest.FromString,
                    response_serializer=payment__pb2.paymentAmountReply.SerializeToString,
            ),
            'paymentDate': grpc.unary_unary_rpc_method_handler(
                    servicer.paymentDate,
                    request_deserializer=payment__pb2.paymentDateRequest.FromString,
                    response_serializer=payment__pb2.paymentDateReply.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'com.michaelbutler.grpc.payment.Greeter', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Greeter(object):
    """The greeting service definition.
    """

    @staticmethod
    def paymentAmount(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.michaelbutler.grpc.payment.Greeter/paymentAmount',
            payment__pb2.paymentAmountRequest.SerializeToString,
            payment__pb2.paymentAmountReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def paymentDate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.michaelbutler.grpc.payment.Greeter/paymentDate',
            payment__pb2.paymentDateRequest.SerializeToString,
            payment__pb2.paymentDateReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

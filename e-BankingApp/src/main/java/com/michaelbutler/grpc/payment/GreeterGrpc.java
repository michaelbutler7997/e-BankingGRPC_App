package com.michaelbutler.grpc.payment;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: payment.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "com.michaelbutler.grpc.payment.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.michaelbutler.grpc.payment.paymentAmountRequest,
      com.michaelbutler.grpc.payment.paymentAmountReply> getPaymentAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "paymentAmount",
      requestType = com.michaelbutler.grpc.payment.paymentAmountRequest.class,
      responseType = com.michaelbutler.grpc.payment.paymentAmountReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.michaelbutler.grpc.payment.paymentAmountRequest,
      com.michaelbutler.grpc.payment.paymentAmountReply> getPaymentAmountMethod() {
    io.grpc.MethodDescriptor<com.michaelbutler.grpc.payment.paymentAmountRequest, com.michaelbutler.grpc.payment.paymentAmountReply> getPaymentAmountMethod;
    if ((getPaymentAmountMethod = GreeterGrpc.getPaymentAmountMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getPaymentAmountMethod = GreeterGrpc.getPaymentAmountMethod) == null) {
          GreeterGrpc.getPaymentAmountMethod = getPaymentAmountMethod = 
              io.grpc.MethodDescriptor.<com.michaelbutler.grpc.payment.paymentAmountRequest, com.michaelbutler.grpc.payment.paymentAmountReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.michaelbutler.grpc.payment.Greeter", "paymentAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.payment.paymentAmountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.payment.paymentAmountReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("paymentAmount"))
                  .build();
          }
        }
     }
     return getPaymentAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.michaelbutler.grpc.payment.paymentDateRequest,
      com.michaelbutler.grpc.payment.paymentDateReply> getPaymentDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "paymentDate",
      requestType = com.michaelbutler.grpc.payment.paymentDateRequest.class,
      responseType = com.michaelbutler.grpc.payment.paymentDateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.michaelbutler.grpc.payment.paymentDateRequest,
      com.michaelbutler.grpc.payment.paymentDateReply> getPaymentDateMethod() {
    io.grpc.MethodDescriptor<com.michaelbutler.grpc.payment.paymentDateRequest, com.michaelbutler.grpc.payment.paymentDateReply> getPaymentDateMethod;
    if ((getPaymentDateMethod = GreeterGrpc.getPaymentDateMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getPaymentDateMethod = GreeterGrpc.getPaymentDateMethod) == null) {
          GreeterGrpc.getPaymentDateMethod = getPaymentDateMethod = 
              io.grpc.MethodDescriptor.<com.michaelbutler.grpc.payment.paymentDateRequest, com.michaelbutler.grpc.payment.paymentDateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.michaelbutler.grpc.payment.Greeter", "paymentDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.payment.paymentDateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.payment.paymentDateReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("paymentDate"))
                  .build();
          }
        }
     }
     return getPaymentDateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void paymentAmount(com.michaelbutler.grpc.payment.paymentAmountRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.payment.paymentAmountReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPaymentAmountMethod(), responseObserver);
    }

    /**
     */
    public void paymentDate(com.michaelbutler.grpc.payment.paymentDateRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.payment.paymentDateReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPaymentDateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPaymentAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.michaelbutler.grpc.payment.paymentAmountRequest,
                com.michaelbutler.grpc.payment.paymentAmountReply>(
                  this, METHODID_PAYMENT_AMOUNT)))
          .addMethod(
            getPaymentDateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.michaelbutler.grpc.payment.paymentDateRequest,
                com.michaelbutler.grpc.payment.paymentDateReply>(
                  this, METHODID_PAYMENT_DATE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void paymentAmount(com.michaelbutler.grpc.payment.paymentAmountRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.payment.paymentAmountReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPaymentAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void paymentDate(com.michaelbutler.grpc.payment.paymentDateRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.payment.paymentDateReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPaymentDateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.michaelbutler.grpc.payment.paymentAmountReply paymentAmount(com.michaelbutler.grpc.payment.paymentAmountRequest request) {
      return blockingUnaryCall(
          getChannel(), getPaymentAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.michaelbutler.grpc.payment.paymentDateReply paymentDate(com.michaelbutler.grpc.payment.paymentDateRequest request) {
      return blockingUnaryCall(
          getChannel(), getPaymentDateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.michaelbutler.grpc.payment.paymentAmountReply> paymentAmount(
        com.michaelbutler.grpc.payment.paymentAmountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPaymentAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.michaelbutler.grpc.payment.paymentDateReply> paymentDate(
        com.michaelbutler.grpc.payment.paymentDateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPaymentDateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAYMENT_AMOUNT = 0;
  private static final int METHODID_PAYMENT_DATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAYMENT_AMOUNT:
          serviceImpl.paymentAmount((com.michaelbutler.grpc.payment.paymentAmountRequest) request,
              (io.grpc.stub.StreamObserver<com.michaelbutler.grpc.payment.paymentAmountReply>) responseObserver);
          break;
        case METHODID_PAYMENT_DATE:
          serviceImpl.paymentDate((com.michaelbutler.grpc.payment.paymentDateRequest) request,
              (io.grpc.stub.StreamObserver<com.michaelbutler.grpc.payment.paymentDateReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.michaelbutler.grpc.payment.paymentServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getPaymentAmountMethod())
              .addMethod(getPaymentDateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

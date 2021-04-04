package com.michaelbutler.grpc.bankAccount;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bankAccount.proto")
public final class bankServiceGrpc {

  private bankServiceGrpc() {}

  public static final String SERVICE_NAME = "com.michaelbutler.grpc.bankAccount.bankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.michaelbutler.grpc.bankAccount.accountBalanceRequest,
      com.michaelbutler.grpc.bankAccount.accountBalanceReply> getAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accountBalance",
      requestType = com.michaelbutler.grpc.bankAccount.accountBalanceRequest.class,
      responseType = com.michaelbutler.grpc.bankAccount.accountBalanceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.michaelbutler.grpc.bankAccount.accountBalanceRequest,
      com.michaelbutler.grpc.bankAccount.accountBalanceReply> getAccountBalanceMethod() {
    io.grpc.MethodDescriptor<com.michaelbutler.grpc.bankAccount.accountBalanceRequest, com.michaelbutler.grpc.bankAccount.accountBalanceReply> getAccountBalanceMethod;
    if ((getAccountBalanceMethod = bankServiceGrpc.getAccountBalanceMethod) == null) {
      synchronized (bankServiceGrpc.class) {
        if ((getAccountBalanceMethod = bankServiceGrpc.getAccountBalanceMethod) == null) {
          bankServiceGrpc.getAccountBalanceMethod = getAccountBalanceMethod = 
              io.grpc.MethodDescriptor.<com.michaelbutler.grpc.bankAccount.accountBalanceRequest, com.michaelbutler.grpc.bankAccount.accountBalanceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.michaelbutler.grpc.bankAccount.bankService", "accountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.bankAccount.accountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.bankAccount.accountBalanceReply.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServiceMethodDescriptorSupplier("accountBalance"))
                  .build();
          }
        }
     }
     return getAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest,
      com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply> getAddWithdrawFundsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addWithdrawFunds",
      requestType = com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest.class,
      responseType = com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest,
      com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply> getAddWithdrawFundsMethod() {
    io.grpc.MethodDescriptor<com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest, com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply> getAddWithdrawFundsMethod;
    if ((getAddWithdrawFundsMethod = bankServiceGrpc.getAddWithdrawFundsMethod) == null) {
      synchronized (bankServiceGrpc.class) {
        if ((getAddWithdrawFundsMethod = bankServiceGrpc.getAddWithdrawFundsMethod) == null) {
          bankServiceGrpc.getAddWithdrawFundsMethod = getAddWithdrawFundsMethod = 
              io.grpc.MethodDescriptor.<com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest, com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.michaelbutler.grpc.bankAccount.bankService", "addWithdrawFunds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServiceMethodDescriptorSupplier("addWithdrawFunds"))
                  .build();
          }
        }
     }
     return getAddWithdrawFundsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bankServiceStub newStub(io.grpc.Channel channel) {
    return new bankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class bankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public void accountBalance(com.michaelbutler.grpc.bankAccount.accountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.bankAccount.accountBalanceReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountBalanceMethod(), responseObserver);
    }

    /**
     */
    public void addWithdrawFunds(com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddWithdrawFundsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccountBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.michaelbutler.grpc.bankAccount.accountBalanceRequest,
                com.michaelbutler.grpc.bankAccount.accountBalanceReply>(
                  this, METHODID_ACCOUNT_BALANCE)))
          .addMethod(
            getAddWithdrawFundsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest,
                com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply>(
                  this, METHODID_ADD_WITHDRAW_FUNDS)))
          .build();
    }
  }

  /**
   */
  public static final class bankServiceStub extends io.grpc.stub.AbstractStub<bankServiceStub> {
    private bankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public void accountBalance(com.michaelbutler.grpc.bankAccount.accountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.bankAccount.accountBalanceReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addWithdrawFunds(com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddWithdrawFundsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class bankServiceBlockingStub extends io.grpc.stub.AbstractStub<bankServiceBlockingStub> {
    private bankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public com.michaelbutler.grpc.bankAccount.accountBalanceReply accountBalance(com.michaelbutler.grpc.bankAccount.accountBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply addWithdrawFunds(com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddWithdrawFundsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bankServiceFutureStub extends io.grpc.stub.AbstractStub<bankServiceFutureStub> {
    private bankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.michaelbutler.grpc.bankAccount.accountBalanceReply> accountBalance(
        com.michaelbutler.grpc.bankAccount.accountBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply> addWithdrawFunds(
        com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddWithdrawFundsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNT_BALANCE = 0;
  private static final int METHODID_ADD_WITHDRAW_FUNDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCOUNT_BALANCE:
          serviceImpl.accountBalance((com.michaelbutler.grpc.bankAccount.accountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.michaelbutler.grpc.bankAccount.accountBalanceReply>) responseObserver);
          break;
        case METHODID_ADD_WITHDRAW_FUNDS:
          serviceImpl.addWithdrawFunds((com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest) request,
              (io.grpc.stub.StreamObserver<com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply>) responseObserver);
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

  private static abstract class bankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.michaelbutler.grpc.bankAccount.BankServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bankService");
    }
  }

  private static final class bankServiceFileDescriptorSupplier
      extends bankServiceBaseDescriptorSupplier {
    bankServiceFileDescriptorSupplier() {}
  }

  private static final class bankServiceMethodDescriptorSupplier
      extends bankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (bankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bankServiceFileDescriptorSupplier())
              .addMethod(getAccountBalanceMethod())
              .addMethod(getAddWithdrawFundsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

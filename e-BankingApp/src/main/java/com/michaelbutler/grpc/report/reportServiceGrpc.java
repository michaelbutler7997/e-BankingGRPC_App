package com.michaelbutler.grpc.report;

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
    comments = "Source: report.proto")
public final class reportServiceGrpc {

  private reportServiceGrpc() {}

  public static final String SERVICE_NAME = "com.michaelbutler.grpc.report.reportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.fullReportListRequest,
      com.michaelbutler.grpc.report.fullReportListReply> getFullReportListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullReportList",
      requestType = com.michaelbutler.grpc.report.fullReportListRequest.class,
      responseType = com.michaelbutler.grpc.report.fullReportListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.fullReportListRequest,
      com.michaelbutler.grpc.report.fullReportListReply> getFullReportListMethod() {
    io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.fullReportListRequest, com.michaelbutler.grpc.report.fullReportListReply> getFullReportListMethod;
    if ((getFullReportListMethod = reportServiceGrpc.getFullReportListMethod) == null) {
      synchronized (reportServiceGrpc.class) {
        if ((getFullReportListMethod = reportServiceGrpc.getFullReportListMethod) == null) {
          reportServiceGrpc.getFullReportListMethod = getFullReportListMethod = 
              io.grpc.MethodDescriptor.<com.michaelbutler.grpc.report.fullReportListRequest, com.michaelbutler.grpc.report.fullReportListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.michaelbutler.grpc.report.reportService", "fullReportList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.report.fullReportListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.report.fullReportListReply.getDefaultInstance()))
                  .setSchemaDescriptor(new reportServiceMethodDescriptorSupplier("fullReportList"))
                  .build();
          }
        }
     }
     return getFullReportListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.addReportListRequest,
      com.michaelbutler.grpc.report.addReportListReply> getAddReportListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addReportList",
      requestType = com.michaelbutler.grpc.report.addReportListRequest.class,
      responseType = com.michaelbutler.grpc.report.addReportListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.addReportListRequest,
      com.michaelbutler.grpc.report.addReportListReply> getAddReportListMethod() {
    io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.addReportListRequest, com.michaelbutler.grpc.report.addReportListReply> getAddReportListMethod;
    if ((getAddReportListMethod = reportServiceGrpc.getAddReportListMethod) == null) {
      synchronized (reportServiceGrpc.class) {
        if ((getAddReportListMethod = reportServiceGrpc.getAddReportListMethod) == null) {
          reportServiceGrpc.getAddReportListMethod = getAddReportListMethod = 
              io.grpc.MethodDescriptor.<com.michaelbutler.grpc.report.addReportListRequest, com.michaelbutler.grpc.report.addReportListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.michaelbutler.grpc.report.reportService", "addReportList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.report.addReportListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.report.addReportListReply.getDefaultInstance()))
                  .setSchemaDescriptor(new reportServiceMethodDescriptorSupplier("addReportList"))
                  .build();
          }
        }
     }
     return getAddReportListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.withdrawReportListRequest,
      com.michaelbutler.grpc.report.withdrawReportListReply> getWithdrawReportListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "withdrawReportList",
      requestType = com.michaelbutler.grpc.report.withdrawReportListRequest.class,
      responseType = com.michaelbutler.grpc.report.withdrawReportListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.withdrawReportListRequest,
      com.michaelbutler.grpc.report.withdrawReportListReply> getWithdrawReportListMethod() {
    io.grpc.MethodDescriptor<com.michaelbutler.grpc.report.withdrawReportListRequest, com.michaelbutler.grpc.report.withdrawReportListReply> getWithdrawReportListMethod;
    if ((getWithdrawReportListMethod = reportServiceGrpc.getWithdrawReportListMethod) == null) {
      synchronized (reportServiceGrpc.class) {
        if ((getWithdrawReportListMethod = reportServiceGrpc.getWithdrawReportListMethod) == null) {
          reportServiceGrpc.getWithdrawReportListMethod = getWithdrawReportListMethod = 
              io.grpc.MethodDescriptor.<com.michaelbutler.grpc.report.withdrawReportListRequest, com.michaelbutler.grpc.report.withdrawReportListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.michaelbutler.grpc.report.reportService", "withdrawReportList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.report.withdrawReportListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.michaelbutler.grpc.report.withdrawReportListReply.getDefaultInstance()))
                  .setSchemaDescriptor(new reportServiceMethodDescriptorSupplier("withdrawReportList"))
                  .build();
          }
        }
     }
     return getWithdrawReportListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static reportServiceStub newStub(io.grpc.Channel channel) {
    return new reportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static reportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new reportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static reportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new reportServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class reportServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public void fullReportList(com.michaelbutler.grpc.report.fullReportListRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.fullReportListReply> responseObserver) {
      asyncUnimplementedUnaryCall(getFullReportListMethod(), responseObserver);
    }

    /**
     */
    public void addReportList(com.michaelbutler.grpc.report.addReportListRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.addReportListReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddReportListMethod(), responseObserver);
    }

    /**
     */
    public void withdrawReportList(com.michaelbutler.grpc.report.withdrawReportListRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.withdrawReportListReply> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawReportListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFullReportListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.michaelbutler.grpc.report.fullReportListRequest,
                com.michaelbutler.grpc.report.fullReportListReply>(
                  this, METHODID_FULL_REPORT_LIST)))
          .addMethod(
            getAddReportListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.michaelbutler.grpc.report.addReportListRequest,
                com.michaelbutler.grpc.report.addReportListReply>(
                  this, METHODID_ADD_REPORT_LIST)))
          .addMethod(
            getWithdrawReportListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.michaelbutler.grpc.report.withdrawReportListRequest,
                com.michaelbutler.grpc.report.withdrawReportListReply>(
                  this, METHODID_WITHDRAW_REPORT_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class reportServiceStub extends io.grpc.stub.AbstractStub<reportServiceStub> {
    private reportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private reportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected reportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new reportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public void fullReportList(com.michaelbutler.grpc.report.fullReportListRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.fullReportListReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFullReportListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReportList(com.michaelbutler.grpc.report.addReportListRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.addReportListReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddReportListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawReportList(com.michaelbutler.grpc.report.withdrawReportListRequest request,
        io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.withdrawReportListReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawReportListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class reportServiceBlockingStub extends io.grpc.stub.AbstractStub<reportServiceBlockingStub> {
    private reportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private reportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected reportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new reportServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public com.michaelbutler.grpc.report.fullReportListReply fullReportList(com.michaelbutler.grpc.report.fullReportListRequest request) {
      return blockingUnaryCall(
          getChannel(), getFullReportListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.michaelbutler.grpc.report.addReportListReply addReportList(com.michaelbutler.grpc.report.addReportListRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddReportListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.michaelbutler.grpc.report.withdrawReportListReply withdrawReportList(com.michaelbutler.grpc.report.withdrawReportListRequest request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawReportListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class reportServiceFutureStub extends io.grpc.stub.AbstractStub<reportServiceFutureStub> {
    private reportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private reportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected reportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new reportServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *specify the RPC
     *check balance, add funds, withdraw funds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.michaelbutler.grpc.report.fullReportListReply> fullReportList(
        com.michaelbutler.grpc.report.fullReportListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFullReportListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.michaelbutler.grpc.report.addReportListReply> addReportList(
        com.michaelbutler.grpc.report.addReportListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddReportListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.michaelbutler.grpc.report.withdrawReportListReply> withdrawReportList(
        com.michaelbutler.grpc.report.withdrawReportListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawReportListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FULL_REPORT_LIST = 0;
  private static final int METHODID_ADD_REPORT_LIST = 1;
  private static final int METHODID_WITHDRAW_REPORT_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final reportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(reportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FULL_REPORT_LIST:
          serviceImpl.fullReportList((com.michaelbutler.grpc.report.fullReportListRequest) request,
              (io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.fullReportListReply>) responseObserver);
          break;
        case METHODID_ADD_REPORT_LIST:
          serviceImpl.addReportList((com.michaelbutler.grpc.report.addReportListRequest) request,
              (io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.addReportListReply>) responseObserver);
          break;
        case METHODID_WITHDRAW_REPORT_LIST:
          serviceImpl.withdrawReportList((com.michaelbutler.grpc.report.withdrawReportListRequest) request,
              (io.grpc.stub.StreamObserver<com.michaelbutler.grpc.report.withdrawReportListReply>) responseObserver);
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

  private static abstract class reportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    reportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.michaelbutler.grpc.report.ReportServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("reportService");
    }
  }

  private static final class reportServiceFileDescriptorSupplier
      extends reportServiceBaseDescriptorSupplier {
    reportServiceFileDescriptorSupplier() {}
  }

  private static final class reportServiceMethodDescriptorSupplier
      extends reportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    reportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (reportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new reportServiceFileDescriptorSupplier())
              .addMethod(getFullReportListMethod())
              .addMethod(getAddReportListMethod())
              .addMethod(getWithdrawReportListMethod())
              .build();
        }
      }
    }
    return result;
  }
}

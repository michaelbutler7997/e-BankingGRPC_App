// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package com.michaelbutler.grpc.payment;

public final class paymentServiceImpl {
  private paymentServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_payment_paymentAmountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_payment_paymentAmountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_payment_paymentAmountReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_payment_paymentAmountReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_payment_paymentDateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_payment_paymentDateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_payment_paymentDateReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_payment_paymentDateReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpayment.proto\022\036com.michaelbutler.grpc." +
      "payment\"&\n\024paymentAmountRequest\022\016\n\006amoun" +
      "t\030\001 \001(\t\"%\n\022paymentAmountReply\022\017\n\007rAmount" +
      "\030\001 \001(\t\"\"\n\022paymentDateRequest\022\014\n\004date\030\001 \001" +
      "(\t\"!\n\020paymentDateReply\022\r\n\005rDate\030\001 \001(\t2\375\001" +
      "\n\007Greeter\022{\n\rpaymentAmount\0224.com.michael" +
      "butler.grpc.payment.paymentAmountRequest" +
      "\0322.com.michaelbutler.grpc.payment.paymen" +
      "tAmountReply\"\000\022u\n\013paymentDate\0222.com.mich" +
      "aelbutler.grpc.payment.paymentDateReques" +
      "t\0320.com.michaelbutler.grpc.payment.payme" +
      "ntDateReply\"\000B<\n\036com.michaelbutler.grpc." +
      "paymentB\022paymentServiceImplP\001\242\002\003HLWb\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_michaelbutler_grpc_payment_paymentAmountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_michaelbutler_grpc_payment_paymentAmountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_payment_paymentAmountRequest_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_com_michaelbutler_grpc_payment_paymentAmountReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_michaelbutler_grpc_payment_paymentAmountReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_payment_paymentAmountReply_descriptor,
        new java.lang.String[] { "RAmount", });
    internal_static_com_michaelbutler_grpc_payment_paymentDateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_michaelbutler_grpc_payment_paymentDateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_payment_paymentDateRequest_descriptor,
        new java.lang.String[] { "Date", });
    internal_static_com_michaelbutler_grpc_payment_paymentDateReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_michaelbutler_grpc_payment_paymentDateReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_payment_paymentDateReply_descriptor,
        new java.lang.String[] { "RDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

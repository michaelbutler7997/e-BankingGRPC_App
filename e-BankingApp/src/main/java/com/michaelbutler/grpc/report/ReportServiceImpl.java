// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: report.proto

package com.michaelbutler.grpc.report;

public final class ReportServiceImpl {
  private ReportServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_report_fullReportListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_report_fullReportListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_report_fullReportListReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_report_fullReportListReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_report_addReportListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_report_addReportListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_report_addReportListReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_report_addReportListReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_report_withdrawReportListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_report_withdrawReportListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_michaelbutler_grpc_report_withdrawReportListReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_michaelbutler_grpc_report_withdrawReportListReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014report.proto\022\035com.michaelbutler.grpc.r" +
      "eport\"\'\n\025fullReportListRequest\022\016\n\006report" +
      "\030\001 \001(\t\"&\n\023fullReportListReply\022\017\n\007rReport" +
      "\030\001 \001(\t\"&\n\024addReportListRequest\022\016\n\006report" +
      "\030\001 \001(\t\"%\n\022addReportListReply\022\017\n\007rReport\030" +
      "\001 \001(\t\"+\n\031withdrawReportListRequest\022\016\n\006re" +
      "port\030\001 \001(\t\"*\n\027withdrawReportListReply\022\017\n" +
      "\007rReport\030\001 \001(\t2\222\003\n\rreportService\022|\n\016full" +
      "ReportList\0224.com.michaelbutler.grpc.repo" +
      "rt.fullReportListRequest\0322.com.michaelbu" +
      "tler.grpc.report.fullReportListReply\"\000\022y" +
      "\n\raddReportList\0223.com.michaelbutler.grpc" +
      ".report.addReportListRequest\0321.com.micha" +
      "elbutler.grpc.report.addReportListReply\"" +
      "\000\022\207\001\n\021wthdrawReportList\0228.com.michaelbut" +
      "ler.grpc.report.withdrawReportListReques" +
      "t\0326.com.michaelbutler.grpc.report.withdr" +
      "awReportListReply\"\000B4\n\035com.michaelbutler" +
      ".grpc.reportB\021ReportServiceImplP\001b\006proto" +
      "3"
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
    internal_static_com_michaelbutler_grpc_report_fullReportListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_michaelbutler_grpc_report_fullReportListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_report_fullReportListRequest_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_com_michaelbutler_grpc_report_fullReportListReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_michaelbutler_grpc_report_fullReportListReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_report_fullReportListReply_descriptor,
        new java.lang.String[] { "RReport", });
    internal_static_com_michaelbutler_grpc_report_addReportListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_michaelbutler_grpc_report_addReportListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_report_addReportListRequest_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_com_michaelbutler_grpc_report_addReportListReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_michaelbutler_grpc_report_addReportListReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_report_addReportListReply_descriptor,
        new java.lang.String[] { "RReport", });
    internal_static_com_michaelbutler_grpc_report_withdrawReportListRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_michaelbutler_grpc_report_withdrawReportListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_report_withdrawReportListRequest_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_com_michaelbutler_grpc_report_withdrawReportListReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_michaelbutler_grpc_report_withdrawReportListReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_michaelbutler_grpc_report_withdrawReportListReply_descriptor,
        new java.lang.String[] { "RReport", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
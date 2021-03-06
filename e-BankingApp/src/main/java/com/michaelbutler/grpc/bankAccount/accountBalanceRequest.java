// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bankAccount.proto

package com.michaelbutler.grpc.bankAccount;

/**
 * Protobuf type {@code com.michaelbutler.grpc.bankAccount.accountBalanceRequest}
 */
public  final class accountBalanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.michaelbutler.grpc.bankAccount.accountBalanceRequest)
    accountBalanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use accountBalanceRequest.newBuilder() to construct.
  private accountBalanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private accountBalanceRequest() {
    balance_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private accountBalanceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            balance_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.michaelbutler.grpc.bankAccount.BankServiceImpl.internal_static_com_michaelbutler_grpc_bankAccount_accountBalanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.michaelbutler.grpc.bankAccount.BankServiceImpl.internal_static_com_michaelbutler_grpc_bankAccount_accountBalanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.michaelbutler.grpc.bankAccount.accountBalanceRequest.class, com.michaelbutler.grpc.bankAccount.accountBalanceRequest.Builder.class);
  }

  public static final int BALANCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object balance_;
  /**
   * <code>string balance = 1;</code>
   */
  public java.lang.String getBalance() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      balance_ = s;
      return s;
    }
  }
  /**
   * <code>string balance = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBalanceBytes() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      balance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getBalanceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, balance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBalanceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, balance_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.michaelbutler.grpc.bankAccount.accountBalanceRequest)) {
      return super.equals(obj);
    }
    com.michaelbutler.grpc.bankAccount.accountBalanceRequest other = (com.michaelbutler.grpc.bankAccount.accountBalanceRequest) obj;

    boolean result = true;
    result = result && getBalance()
        .equals(other.getBalance());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getBalance().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.michaelbutler.grpc.bankAccount.accountBalanceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.michaelbutler.grpc.bankAccount.accountBalanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.michaelbutler.grpc.bankAccount.accountBalanceRequest)
      com.michaelbutler.grpc.bankAccount.accountBalanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.michaelbutler.grpc.bankAccount.BankServiceImpl.internal_static_com_michaelbutler_grpc_bankAccount_accountBalanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.michaelbutler.grpc.bankAccount.BankServiceImpl.internal_static_com_michaelbutler_grpc_bankAccount_accountBalanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.michaelbutler.grpc.bankAccount.accountBalanceRequest.class, com.michaelbutler.grpc.bankAccount.accountBalanceRequest.Builder.class);
    }

    // Construct using com.michaelbutler.grpc.bankAccount.accountBalanceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      balance_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.michaelbutler.grpc.bankAccount.BankServiceImpl.internal_static_com_michaelbutler_grpc_bankAccount_accountBalanceRequest_descriptor;
    }

    @java.lang.Override
    public com.michaelbutler.grpc.bankAccount.accountBalanceRequest getDefaultInstanceForType() {
      return com.michaelbutler.grpc.bankAccount.accountBalanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.michaelbutler.grpc.bankAccount.accountBalanceRequest build() {
      com.michaelbutler.grpc.bankAccount.accountBalanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.michaelbutler.grpc.bankAccount.accountBalanceRequest buildPartial() {
      com.michaelbutler.grpc.bankAccount.accountBalanceRequest result = new com.michaelbutler.grpc.bankAccount.accountBalanceRequest(this);
      result.balance_ = balance_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.michaelbutler.grpc.bankAccount.accountBalanceRequest) {
        return mergeFrom((com.michaelbutler.grpc.bankAccount.accountBalanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.michaelbutler.grpc.bankAccount.accountBalanceRequest other) {
      if (other == com.michaelbutler.grpc.bankAccount.accountBalanceRequest.getDefaultInstance()) return this;
      if (!other.getBalance().isEmpty()) {
        balance_ = other.balance_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.michaelbutler.grpc.bankAccount.accountBalanceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.michaelbutler.grpc.bankAccount.accountBalanceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object balance_ = "";
    /**
     * <code>string balance = 1;</code>
     */
    public java.lang.String getBalance() {
      java.lang.Object ref = balance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        balance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string balance = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBalanceBytes() {
      java.lang.Object ref = balance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        balance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string balance = 1;</code>
     */
    public Builder setBalance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string balance = 1;</code>
     */
    public Builder clearBalance() {
      
      balance_ = getDefaultInstance().getBalance();
      onChanged();
      return this;
    }
    /**
     * <code>string balance = 1;</code>
     */
    public Builder setBalanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      balance_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.michaelbutler.grpc.bankAccount.accountBalanceRequest)
  }

  // @@protoc_insertion_point(class_scope:com.michaelbutler.grpc.bankAccount.accountBalanceRequest)
  private static final com.michaelbutler.grpc.bankAccount.accountBalanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.michaelbutler.grpc.bankAccount.accountBalanceRequest();
  }

  public static com.michaelbutler.grpc.bankAccount.accountBalanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<accountBalanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<accountBalanceRequest>() {
    @java.lang.Override
    public accountBalanceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new accountBalanceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<accountBalanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<accountBalanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.michaelbutler.grpc.bankAccount.accountBalanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


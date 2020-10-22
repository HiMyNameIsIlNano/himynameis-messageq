// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manageQueue.proto

package com.messageq.config;

/**
 * Protobuf type {@code ExchangeCreationResponse}
 */
public final class ExchangeCreationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ExchangeCreationResponse)
    ExchangeCreationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExchangeCreationResponse.newBuilder() to construct.
  private ExchangeCreationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExchangeCreationResponse() {
    exchangeName_ = "";
    errorMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExchangeCreationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExchangeCreationResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            exchangeName_ = s;
            break;
          }
          case 16: {

            created_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.messageq.config.ManageQueue.internal_static_ExchangeCreationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.messageq.config.ManageQueue.internal_static_ExchangeCreationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.messageq.config.ExchangeCreationResponse.class, com.messageq.config.ExchangeCreationResponse.Builder.class);
  }

  public static final int EXCHANGENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object exchangeName_;
  /**
   * <code>string exchangeName = 1;</code>
   * @return The exchangeName.
   */
  @java.lang.Override
  public java.lang.String getExchangeName() {
    java.lang.Object ref = exchangeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exchangeName_ = s;
      return s;
    }
  }
  /**
   * <code>string exchangeName = 1;</code>
   * @return The bytes for exchangeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExchangeNameBytes() {
    java.lang.Object ref = exchangeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exchangeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_FIELD_NUMBER = 2;
  private boolean created_;
  /**
   * <code>bool created = 2;</code>
   * @return The created.
   */
  @java.lang.Override
  public boolean getCreated() {
    return created_;
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>string errorMessage = 3;</code>
   * @return The errorMessage.
   */
  @java.lang.Override
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string errorMessage = 3;</code>
   * @return The bytes for errorMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
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
    if (!getExchangeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, exchangeName_);
    }
    if (created_ != false) {
      output.writeBool(2, created_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getExchangeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, exchangeName_);
    }
    if (created_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, created_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorMessage_);
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
    if (!(obj instanceof com.messageq.config.ExchangeCreationResponse)) {
      return super.equals(obj);
    }
    com.messageq.config.ExchangeCreationResponse other = (com.messageq.config.ExchangeCreationResponse) obj;

    if (!getExchangeName()
        .equals(other.getExchangeName())) return false;
    if (getCreated()
        != other.getCreated()) return false;
    if (!getErrorMessage()
        .equals(other.getErrorMessage())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EXCHANGENAME_FIELD_NUMBER;
    hash = (53 * hash) + getExchangeName().hashCode();
    hash = (37 * hash) + CREATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCreated());
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.messageq.config.ExchangeCreationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messageq.config.ExchangeCreationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.messageq.config.ExchangeCreationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messageq.config.ExchangeCreationResponse parseFrom(
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
  public static Builder newBuilder(com.messageq.config.ExchangeCreationResponse prototype) {
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
   * Protobuf type {@code ExchangeCreationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ExchangeCreationResponse)
      com.messageq.config.ExchangeCreationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.messageq.config.ManageQueue.internal_static_ExchangeCreationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.messageq.config.ManageQueue.internal_static_ExchangeCreationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.messageq.config.ExchangeCreationResponse.class, com.messageq.config.ExchangeCreationResponse.Builder.class);
    }

    // Construct using com.messageq.config.ExchangeCreationResponse.newBuilder()
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
      exchangeName_ = "";

      created_ = false;

      errorMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.messageq.config.ManageQueue.internal_static_ExchangeCreationResponse_descriptor;
    }

    @java.lang.Override
    public com.messageq.config.ExchangeCreationResponse getDefaultInstanceForType() {
      return com.messageq.config.ExchangeCreationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.messageq.config.ExchangeCreationResponse build() {
      com.messageq.config.ExchangeCreationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.messageq.config.ExchangeCreationResponse buildPartial() {
      com.messageq.config.ExchangeCreationResponse result = new com.messageq.config.ExchangeCreationResponse(this);
      result.exchangeName_ = exchangeName_;
      result.created_ = created_;
      result.errorMessage_ = errorMessage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.messageq.config.ExchangeCreationResponse) {
        return mergeFrom((com.messageq.config.ExchangeCreationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.messageq.config.ExchangeCreationResponse other) {
      if (other == com.messageq.config.ExchangeCreationResponse.getDefaultInstance()) return this;
      if (!other.getExchangeName().isEmpty()) {
        exchangeName_ = other.exchangeName_;
        onChanged();
      }
      if (other.getCreated() != false) {
        setCreated(other.getCreated());
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
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
      com.messageq.config.ExchangeCreationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.messageq.config.ExchangeCreationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object exchangeName_ = "";
    /**
     * <code>string exchangeName = 1;</code>
     * @return The exchangeName.
     */
    public java.lang.String getExchangeName() {
      java.lang.Object ref = exchangeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exchangeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @return The bytes for exchangeName.
     */
    public com.google.protobuf.ByteString
        getExchangeNameBytes() {
      java.lang.Object ref = exchangeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exchangeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @param value The exchangeName to set.
     * @return This builder for chaining.
     */
    public Builder setExchangeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      exchangeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExchangeName() {
      
      exchangeName_ = getDefaultInstance().getExchangeName();
      onChanged();
      return this;
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @param value The bytes for exchangeName to set.
     * @return This builder for chaining.
     */
    public Builder setExchangeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      exchangeName_ = value;
      onChanged();
      return this;
    }

    private boolean created_ ;
    /**
     * <code>bool created = 2;</code>
     * @return The created.
     */
    @java.lang.Override
    public boolean getCreated() {
      return created_;
    }
    /**
     * <code>bool created = 2;</code>
     * @param value The created to set.
     * @return This builder for chaining.
     */
    public Builder setCreated(boolean value) {
      
      created_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool created = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreated() {
      
      created_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>string errorMessage = 3;</code>
     * @return The errorMessage.
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string errorMessage = 3;</code>
     * @return The bytes for errorMessage.
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string errorMessage = 3;</code>
     * @param value The errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string errorMessage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string errorMessage = 3;</code>
     * @param value The bytes for errorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ExchangeCreationResponse)
  }

  // @@protoc_insertion_point(class_scope:ExchangeCreationResponse)
  private static final com.messageq.config.ExchangeCreationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.messageq.config.ExchangeCreationResponse();
  }

  public static com.messageq.config.ExchangeCreationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExchangeCreationResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExchangeCreationResponse>() {
    @java.lang.Override
    public ExchangeCreationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExchangeCreationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExchangeCreationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExchangeCreationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.messageq.config.ExchangeCreationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

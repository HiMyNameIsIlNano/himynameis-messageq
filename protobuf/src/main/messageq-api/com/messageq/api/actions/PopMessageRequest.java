// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actionQueue.proto

package com.messageq.api.actions;

/**
 * Protobuf type {@code PopMessageRequest}
 */
public final class PopMessageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PopMessageRequest)
    PopMessageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PopMessageRequest.newBuilder() to construct.
  private PopMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PopMessageRequest() {
    queueName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PopMessageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PopMessageRequest(
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

            queueName_ = s;
            break;
          }
          case 18: {
            com.messageq.api.actions.QueueMessage.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.messageq.api.actions.QueueMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

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
    return com.messageq.api.actions.ActionQueue.internal_static_PopMessageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.messageq.api.actions.ActionQueue.internal_static_PopMessageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.messageq.api.actions.PopMessageRequest.class, com.messageq.api.actions.PopMessageRequest.Builder.class);
  }

  public static final int QUEUENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object queueName_;
  /**
   * <code>string queueName = 1;</code>
   * @return The queueName.
   */
  @java.lang.Override
  public java.lang.String getQueueName() {
    java.lang.Object ref = queueName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queueName_ = s;
      return s;
    }
  }
  /**
   * <code>string queueName = 1;</code>
   * @return The bytes for queueName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueueNameBytes() {
    java.lang.Object ref = queueName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queueName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private com.messageq.api.actions.QueueMessage message_;
  /**
   * <code>.QueueMessage message = 2;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.QueueMessage message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public com.messageq.api.actions.QueueMessage getMessage() {
    return message_ == null ? com.messageq.api.actions.QueueMessage.getDefaultInstance() : message_;
  }
  /**
   * <code>.QueueMessage message = 2;</code>
   */
  @java.lang.Override
  public com.messageq.api.actions.QueueMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
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
    if (!getQueueNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queueName_);
    }
    if (message_ != null) {
      output.writeMessage(2, getMessage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getQueueNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queueName_);
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMessage());
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
    if (!(obj instanceof com.messageq.api.actions.PopMessageRequest)) {
      return super.equals(obj);
    }
    com.messageq.api.actions.PopMessageRequest other = (com.messageq.api.actions.PopMessageRequest) obj;

    if (!getQueueName()
        .equals(other.getQueueName())) return false;
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
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
    hash = (37 * hash) + QUEUENAME_FIELD_NUMBER;
    hash = (53 * hash) + getQueueName().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.messageq.api.actions.PopMessageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messageq.api.actions.PopMessageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.messageq.api.actions.PopMessageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.messageq.api.actions.PopMessageRequest parseFrom(
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
  public static Builder newBuilder(com.messageq.api.actions.PopMessageRequest prototype) {
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
   * Protobuf type {@code PopMessageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PopMessageRequest)
      com.messageq.api.actions.PopMessageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.messageq.api.actions.ActionQueue.internal_static_PopMessageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.messageq.api.actions.ActionQueue.internal_static_PopMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.messageq.api.actions.PopMessageRequest.class, com.messageq.api.actions.PopMessageRequest.Builder.class);
    }

    // Construct using com.messageq.api.actions.PopMessageRequest.newBuilder()
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
      queueName_ = "";

      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.messageq.api.actions.ActionQueue.internal_static_PopMessageRequest_descriptor;
    }

    @java.lang.Override
    public com.messageq.api.actions.PopMessageRequest getDefaultInstanceForType() {
      return com.messageq.api.actions.PopMessageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.messageq.api.actions.PopMessageRequest build() {
      com.messageq.api.actions.PopMessageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.messageq.api.actions.PopMessageRequest buildPartial() {
      com.messageq.api.actions.PopMessageRequest result = new com.messageq.api.actions.PopMessageRequest(this);
      result.queueName_ = queueName_;
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
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
      if (other instanceof com.messageq.api.actions.PopMessageRequest) {
        return mergeFrom((com.messageq.api.actions.PopMessageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.messageq.api.actions.PopMessageRequest other) {
      if (other == com.messageq.api.actions.PopMessageRequest.getDefaultInstance()) return this;
      if (!other.getQueueName().isEmpty()) {
        queueName_ = other.queueName_;
        onChanged();
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
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
      com.messageq.api.actions.PopMessageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.messageq.api.actions.PopMessageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object queueName_ = "";
    /**
     * <code>string queueName = 1;</code>
     * @return The queueName.
     */
    public java.lang.String getQueueName() {
      java.lang.Object ref = queueName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queueName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string queueName = 1;</code>
     * @return The bytes for queueName.
     */
    public com.google.protobuf.ByteString
        getQueueNameBytes() {
      java.lang.Object ref = queueName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queueName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string queueName = 1;</code>
     * @param value The queueName to set.
     * @return This builder for chaining.
     */
    public Builder setQueueName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      queueName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string queueName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueueName() {
      
      queueName_ = getDefaultInstance().getQueueName();
      onChanged();
      return this;
    }
    /**
     * <code>string queueName = 1;</code>
     * @param value The bytes for queueName to set.
     * @return This builder for chaining.
     */
    public Builder setQueueNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      queueName_ = value;
      onChanged();
      return this;
    }

    private com.messageq.api.actions.QueueMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.messageq.api.actions.QueueMessage, com.messageq.api.actions.QueueMessage.Builder, com.messageq.api.actions.QueueMessageOrBuilder> messageBuilder_;
    /**
     * <code>.QueueMessage message = 2;</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     * @return The message.
     */
    public com.messageq.api.actions.QueueMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.messageq.api.actions.QueueMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     */
    public Builder setMessage(com.messageq.api.actions.QueueMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     */
    public Builder setMessage(
        com.messageq.api.actions.QueueMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     */
    public Builder mergeMessage(com.messageq.api.actions.QueueMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            com.messageq.api.actions.QueueMessage.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     */
    public com.messageq.api.actions.QueueMessage.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     */
    public com.messageq.api.actions.QueueMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.messageq.api.actions.QueueMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.QueueMessage message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.messageq.api.actions.QueueMessage, com.messageq.api.actions.QueueMessage.Builder, com.messageq.api.actions.QueueMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.messageq.api.actions.QueueMessage, com.messageq.api.actions.QueueMessage.Builder, com.messageq.api.actions.QueueMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:PopMessageRequest)
  }

  // @@protoc_insertion_point(class_scope:PopMessageRequest)
  private static final com.messageq.api.actions.PopMessageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.messageq.api.actions.PopMessageRequest();
  }

  public static com.messageq.api.actions.PopMessageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PopMessageRequest>
      PARSER = new com.google.protobuf.AbstractParser<PopMessageRequest>() {
    @java.lang.Override
    public PopMessageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PopMessageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PopMessageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PopMessageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.messageq.api.actions.PopMessageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manageQueue.proto

package com.messageq.config;

public interface ExchangeCreationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ExchangeCreationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string exchangeName = 1;</code>
   * @return The exchangeName.
   */
  java.lang.String getExchangeName();
  /**
   * <code>string exchangeName = 1;</code>
   * @return The bytes for exchangeName.
   */
  com.google.protobuf.ByteString
      getExchangeNameBytes();

  /**
   * <code>bool created = 2;</code>
   * @return The created.
   */
  boolean getCreated();

  /**
   * <code>string errorMessage = 3;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <code>string errorMessage = 3;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
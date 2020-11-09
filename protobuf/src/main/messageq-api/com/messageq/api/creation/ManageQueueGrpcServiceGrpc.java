package com.messageq.api.creation;

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
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: manageQueue.proto")
public final class ManageQueueGrpcServiceGrpc {

  private ManageQueueGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ManageQueueGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.messageq.api.creation.ExchangeCreationRequest,
      com.messageq.api.creation.ExchangeCreationResponse> getCreateExchangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExchange",
      requestType = com.messageq.api.creation.ExchangeCreationRequest.class,
      responseType = com.messageq.api.creation.ExchangeCreationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.messageq.api.creation.ExchangeCreationRequest,
      com.messageq.api.creation.ExchangeCreationResponse> getCreateExchangeMethod() {
    io.grpc.MethodDescriptor<com.messageq.api.creation.ExchangeCreationRequest, com.messageq.api.creation.ExchangeCreationResponse> getCreateExchangeMethod;
    if ((getCreateExchangeMethod = ManageQueueGrpcServiceGrpc.getCreateExchangeMethod) == null) {
      synchronized (ManageQueueGrpcServiceGrpc.class) {
        if ((getCreateExchangeMethod = ManageQueueGrpcServiceGrpc.getCreateExchangeMethod) == null) {
          ManageQueueGrpcServiceGrpc.getCreateExchangeMethod = getCreateExchangeMethod =
              io.grpc.MethodDescriptor.<com.messageq.api.creation.ExchangeCreationRequest, com.messageq.api.creation.ExchangeCreationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.creation.ExchangeCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.creation.ExchangeCreationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManageQueueGrpcServiceMethodDescriptorSupplier("CreateExchange"))
              .build();
        }
      }
    }
    return getCreateExchangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.messageq.api.creation.CreatePlayerQueueRequest,
      com.messageq.api.creation.CreatePlayerQueueResponse> getConnectPlayerToQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectPlayerToQueue",
      requestType = com.messageq.api.creation.CreatePlayerQueueRequest.class,
      responseType = com.messageq.api.creation.CreatePlayerQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.messageq.api.creation.CreatePlayerQueueRequest,
      com.messageq.api.creation.CreatePlayerQueueResponse> getConnectPlayerToQueueMethod() {
    io.grpc.MethodDescriptor<com.messageq.api.creation.CreatePlayerQueueRequest, com.messageq.api.creation.CreatePlayerQueueResponse> getConnectPlayerToQueueMethod;
    if ((getConnectPlayerToQueueMethod = ManageQueueGrpcServiceGrpc.getConnectPlayerToQueueMethod) == null) {
      synchronized (ManageQueueGrpcServiceGrpc.class) {
        if ((getConnectPlayerToQueueMethod = ManageQueueGrpcServiceGrpc.getConnectPlayerToQueueMethod) == null) {
          ManageQueueGrpcServiceGrpc.getConnectPlayerToQueueMethod = getConnectPlayerToQueueMethod =
              io.grpc.MethodDescriptor.<com.messageq.api.creation.CreatePlayerQueueRequest, com.messageq.api.creation.CreatePlayerQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConnectPlayerToQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.creation.CreatePlayerQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.creation.CreatePlayerQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManageQueueGrpcServiceMethodDescriptorSupplier("ConnectPlayerToQueue"))
              .build();
        }
      }
    }
    return getConnectPlayerToQueueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManageQueueGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManageQueueGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManageQueueGrpcServiceStub>() {
        @java.lang.Override
        public ManageQueueGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManageQueueGrpcServiceStub(channel, callOptions);
        }
      };
    return ManageQueueGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManageQueueGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManageQueueGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManageQueueGrpcServiceBlockingStub>() {
        @java.lang.Override
        public ManageQueueGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManageQueueGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return ManageQueueGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManageQueueGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManageQueueGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManageQueueGrpcServiceFutureStub>() {
        @java.lang.Override
        public ManageQueueGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManageQueueGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return ManageQueueGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ManageQueueGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createExchange(com.messageq.api.creation.ExchangeCreationRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.creation.ExchangeCreationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateExchangeMethod(), responseObserver);
    }

    /**
     */
    public void connectPlayerToQueue(com.messageq.api.creation.CreatePlayerQueueRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.creation.CreatePlayerQueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectPlayerToQueueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateExchangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.messageq.api.creation.ExchangeCreationRequest,
                com.messageq.api.creation.ExchangeCreationResponse>(
                  this, METHODID_CREATE_EXCHANGE)))
          .addMethod(
            getConnectPlayerToQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.messageq.api.creation.CreatePlayerQueueRequest,
                com.messageq.api.creation.CreatePlayerQueueResponse>(
                  this, METHODID_CONNECT_PLAYER_TO_QUEUE)))
          .build();
    }
  }

  /**
   */
  public static final class ManageQueueGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<ManageQueueGrpcServiceStub> {
    private ManageQueueGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManageQueueGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManageQueueGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void createExchange(com.messageq.api.creation.ExchangeCreationRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.creation.ExchangeCreationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateExchangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void connectPlayerToQueue(com.messageq.api.creation.CreatePlayerQueueRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.creation.CreatePlayerQueueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectPlayerToQueueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ManageQueueGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ManageQueueGrpcServiceBlockingStub> {
    private ManageQueueGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManageQueueGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManageQueueGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.messageq.api.creation.ExchangeCreationResponse createExchange(com.messageq.api.creation.ExchangeCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateExchangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.messageq.api.creation.CreatePlayerQueueResponse connectPlayerToQueue(com.messageq.api.creation.CreatePlayerQueueRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectPlayerToQueueMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ManageQueueGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ManageQueueGrpcServiceFutureStub> {
    private ManageQueueGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManageQueueGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManageQueueGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.messageq.api.creation.ExchangeCreationResponse> createExchange(
        com.messageq.api.creation.ExchangeCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateExchangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.messageq.api.creation.CreatePlayerQueueResponse> connectPlayerToQueue(
        com.messageq.api.creation.CreatePlayerQueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectPlayerToQueueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EXCHANGE = 0;
  private static final int METHODID_CONNECT_PLAYER_TO_QUEUE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManageQueueGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManageQueueGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EXCHANGE:
          serviceImpl.createExchange((com.messageq.api.creation.ExchangeCreationRequest) request,
              (io.grpc.stub.StreamObserver<com.messageq.api.creation.ExchangeCreationResponse>) responseObserver);
          break;
        case METHODID_CONNECT_PLAYER_TO_QUEUE:
          serviceImpl.connectPlayerToQueue((com.messageq.api.creation.CreatePlayerQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.messageq.api.creation.CreatePlayerQueueResponse>) responseObserver);
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

  private static abstract class ManageQueueGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManageQueueGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.messageq.api.creation.ManageQueue.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManageQueueGrpcService");
    }
  }

  private static final class ManageQueueGrpcServiceFileDescriptorSupplier
      extends ManageQueueGrpcServiceBaseDescriptorSupplier {
    ManageQueueGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ManageQueueGrpcServiceMethodDescriptorSupplier
      extends ManageQueueGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManageQueueGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManageQueueGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManageQueueGrpcServiceFileDescriptorSupplier())
              .addMethod(getCreateExchangeMethod())
              .addMethod(getConnectPlayerToQueueMethod())
              .build();
        }
      }
    }
    return result;
  }
}

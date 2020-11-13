package com.messageq.api.actions;

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
    comments = "Source: actionQueue.proto")
public final class QueueActionsGrpcServiceGrpc {

  private QueueActionsGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "QueueActionsGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.messageq.api.actions.PushMessageRequest,
      com.messageq.api.actions.PushMessageConfirmationResponse> getPushMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushMessage",
      requestType = com.messageq.api.actions.PushMessageRequest.class,
      responseType = com.messageq.api.actions.PushMessageConfirmationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.messageq.api.actions.PushMessageRequest,
      com.messageq.api.actions.PushMessageConfirmationResponse> getPushMessageMethod() {
    io.grpc.MethodDescriptor<com.messageq.api.actions.PushMessageRequest, com.messageq.api.actions.PushMessageConfirmationResponse> getPushMessageMethod;
    if ((getPushMessageMethod = QueueActionsGrpcServiceGrpc.getPushMessageMethod) == null) {
      synchronized (QueueActionsGrpcServiceGrpc.class) {
        if ((getPushMessageMethod = QueueActionsGrpcServiceGrpc.getPushMessageMethod) == null) {
          QueueActionsGrpcServiceGrpc.getPushMessageMethod = getPushMessageMethod =
              io.grpc.MethodDescriptor.<com.messageq.api.actions.PushMessageRequest, com.messageq.api.actions.PushMessageConfirmationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.actions.PushMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.actions.PushMessageConfirmationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueActionsGrpcServiceMethodDescriptorSupplier("PushMessage"))
              .build();
        }
      }
    }
    return getPushMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.messageq.api.actions.PopMessageRequest,
      com.messageq.api.actions.QueueMessage> getPopMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PopMessage",
      requestType = com.messageq.api.actions.PopMessageRequest.class,
      responseType = com.messageq.api.actions.QueueMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.messageq.api.actions.PopMessageRequest,
      com.messageq.api.actions.QueueMessage> getPopMessageMethod() {
    io.grpc.MethodDescriptor<com.messageq.api.actions.PopMessageRequest, com.messageq.api.actions.QueueMessage> getPopMessageMethod;
    if ((getPopMessageMethod = QueueActionsGrpcServiceGrpc.getPopMessageMethod) == null) {
      synchronized (QueueActionsGrpcServiceGrpc.class) {
        if ((getPopMessageMethod = QueueActionsGrpcServiceGrpc.getPopMessageMethod) == null) {
          QueueActionsGrpcServiceGrpc.getPopMessageMethod = getPopMessageMethod =
              io.grpc.MethodDescriptor.<com.messageq.api.actions.PopMessageRequest, com.messageq.api.actions.QueueMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PopMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.actions.PopMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.messageq.api.actions.QueueMessage.getDefaultInstance()))
              .setSchemaDescriptor(new QueueActionsGrpcServiceMethodDescriptorSupplier("PopMessage"))
              .build();
        }
      }
    }
    return getPopMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueueActionsGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueActionsGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueActionsGrpcServiceStub>() {
        @java.lang.Override
        public QueueActionsGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueActionsGrpcServiceStub(channel, callOptions);
        }
      };
    return QueueActionsGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueueActionsGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueActionsGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueActionsGrpcServiceBlockingStub>() {
        @java.lang.Override
        public QueueActionsGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueActionsGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return QueueActionsGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueueActionsGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueActionsGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueActionsGrpcServiceFutureStub>() {
        @java.lang.Override
        public QueueActionsGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueActionsGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return QueueActionsGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class QueueActionsGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void pushMessage(com.messageq.api.actions.PushMessageRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.actions.PushMessageConfirmationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPushMessageMethod(), responseObserver);
    }

    /**
     */
    public void popMessage(com.messageq.api.actions.PopMessageRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.actions.QueueMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getPopMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPushMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.messageq.api.actions.PushMessageRequest,
                com.messageq.api.actions.PushMessageConfirmationResponse>(
                  this, METHODID_PUSH_MESSAGE)))
          .addMethod(
            getPopMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.messageq.api.actions.PopMessageRequest,
                com.messageq.api.actions.QueueMessage>(
                  this, METHODID_POP_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class QueueActionsGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<QueueActionsGrpcServiceStub> {
    private QueueActionsGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueActionsGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueActionsGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void pushMessage(com.messageq.api.actions.PushMessageRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.actions.PushMessageConfirmationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void popMessage(com.messageq.api.actions.PopMessageRequest request,
        io.grpc.stub.StreamObserver<com.messageq.api.actions.QueueMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPopMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueueActionsGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueueActionsGrpcServiceBlockingStub> {
    private QueueActionsGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueActionsGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueActionsGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.messageq.api.actions.PushMessageConfirmationResponse pushMessage(com.messageq.api.actions.PushMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getPushMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.messageq.api.actions.QueueMessage popMessage(com.messageq.api.actions.PopMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getPopMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueueActionsGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<QueueActionsGrpcServiceFutureStub> {
    private QueueActionsGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueActionsGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueActionsGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.messageq.api.actions.PushMessageConfirmationResponse> pushMessage(
        com.messageq.api.actions.PushMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPushMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.messageq.api.actions.QueueMessage> popMessage(
        com.messageq.api.actions.PopMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPopMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH_MESSAGE = 0;
  private static final int METHODID_POP_MESSAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueueActionsGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueueActionsGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUSH_MESSAGE:
          serviceImpl.pushMessage((com.messageq.api.actions.PushMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.messageq.api.actions.PushMessageConfirmationResponse>) responseObserver);
          break;
        case METHODID_POP_MESSAGE:
          serviceImpl.popMessage((com.messageq.api.actions.PopMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.messageq.api.actions.QueueMessage>) responseObserver);
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

  private static abstract class QueueActionsGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueueActionsGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.messageq.api.actions.ActionQueue.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueueActionsGrpcService");
    }
  }

  private static final class QueueActionsGrpcServiceFileDescriptorSupplier
      extends QueueActionsGrpcServiceBaseDescriptorSupplier {
    QueueActionsGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class QueueActionsGrpcServiceMethodDescriptorSupplier
      extends QueueActionsGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueueActionsGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueueActionsGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueueActionsGrpcServiceFileDescriptorSupplier())
              .addMethod(getPushMessageMethod())
              .addMethod(getPopMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}

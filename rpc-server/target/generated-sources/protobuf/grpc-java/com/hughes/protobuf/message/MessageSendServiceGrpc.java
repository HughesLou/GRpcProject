package com.hughes.protobuf.message;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 消息发送Rpc接口
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.31.1)",
        comments = "Source: message_send.proto")
public final class MessageSendServiceGrpc {

    private MessageSendServiceGrpc() {
    }

    public static final String SERVICE_NAME = "message.MessageSendService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.hughes.protobuf.message.SendRequest,
            com.hughes.protobuf.message.SendResponse> getSendMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "send",
            requestType = com.hughes.protobuf.message.SendRequest.class,
            responseType = com.hughes.protobuf.message.SendResponse.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.hughes.protobuf.message.SendRequest,
            com.hughes.protobuf.message.SendResponse> getSendMethod() {
        io.grpc.MethodDescriptor<com.hughes.protobuf.message.SendRequest, com.hughes.protobuf.message.SendResponse>
                getSendMethod;
        if ((getSendMethod = MessageSendServiceGrpc.getSendMethod) == null) {
            synchronized (MessageSendServiceGrpc.class) {
                if ((getSendMethod = MessageSendServiceGrpc.getSendMethod) == null) {
                    MessageSendServiceGrpc.getSendMethod = getSendMethod =
                            io.grpc.MethodDescriptor.<com.hughes.protobuf.message.SendRequest,
                                            com.hughes.protobuf.message.SendResponse> newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.hughes.protobuf.message.SendRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.hughes.protobuf.message.SendResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new MessageSendServiceMethodDescriptorSupplier("send"))
                                    .build();
                }
            }
        }
        return getSendMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MessageSendServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MessageSendServiceStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<MessageSendServiceStub>() {
                    @java.lang.Override
                    public MessageSendServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new MessageSendServiceStub(channel, callOptions);
                    }
                };
        return MessageSendServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MessageSendServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MessageSendServiceBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<MessageSendServiceBlockingStub>() {
                    @java.lang.Override
                    public MessageSendServiceBlockingStub newStub(io.grpc.Channel channel,
                            io.grpc.CallOptions callOptions) {
                        return new MessageSendServiceBlockingStub(channel, callOptions);
                    }
                };
        return MessageSendServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MessageSendServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MessageSendServiceFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<MessageSendServiceFutureStub>() {
                    @java.lang.Override
                    public MessageSendServiceFutureStub newStub(io.grpc.Channel channel,
                            io.grpc.CallOptions callOptions) {
                        return new MessageSendServiceFutureStub(channel, callOptions);
                    }
                };
        return MessageSendServiceFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * 消息发送Rpc接口
     * </pre>
     */
    public static abstract class MessageSendServiceImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * 发消息方法
         * </pre>
         */
        public void send(com.hughes.protobuf.message.SendRequest request,
                io.grpc.stub.StreamObserver<com.hughes.protobuf.message.SendResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getSendMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.hughes.protobuf.message.SendRequest,
                                            com.hughes.protobuf.message.SendResponse>(
                                            this, METHODID_SEND)))
                    .build();
        }
    }

    /**
     * <pre>
     * 消息发送Rpc接口
     * </pre>
     */
    public static final class MessageSendServiceStub extends io.grpc.stub.AbstractAsyncStub<MessageSendServiceStub> {
        private MessageSendServiceStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MessageSendServiceStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MessageSendServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         * 发消息方法
         * </pre>
         */
        public void send(com.hughes.protobuf.message.SendRequest request,
                io.grpc.stub.StreamObserver<com.hughes.protobuf.message.SendResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * 消息发送Rpc接口
     * </pre>
     */
    public static final class MessageSendServiceBlockingStub
            extends io.grpc.stub.AbstractBlockingStub<MessageSendServiceBlockingStub> {
        private MessageSendServiceBlockingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MessageSendServiceBlockingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MessageSendServiceBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * 发消息方法
         * </pre>
         */
        public com.hughes.protobuf.message.SendResponse send(com.hughes.protobuf.message.SendRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSendMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * 消息发送Rpc接口
     * </pre>
     */
    public static final class MessageSendServiceFutureStub
            extends io.grpc.stub.AbstractFutureStub<MessageSendServiceFutureStub> {
        private MessageSendServiceFutureStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MessageSendServiceFutureStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MessageSendServiceFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * 发消息方法
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.hughes.protobuf.message.SendResponse> send(
                com.hughes.protobuf.message.SendRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSendMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SEND = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final MessageSendServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(MessageSendServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SEND:
                    serviceImpl.send((com.hughes.protobuf.message.SendRequest) request,
                            (io.grpc.stub.StreamObserver<com.hughes.protobuf.message.SendResponse>) responseObserver);
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

    private static abstract class MessageSendServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        MessageSendServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.hughes.protobuf.message.MessageSendProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MessageSendService");
        }
    }

    private static final class MessageSendServiceFileDescriptorSupplier
            extends MessageSendServiceBaseDescriptorSupplier {
        MessageSendServiceFileDescriptorSupplier() {
        }
    }

    private static final class MessageSendServiceMethodDescriptorSupplier
            extends MessageSendServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        MessageSendServiceMethodDescriptorSupplier(String methodName) {
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
            synchronized (MessageSendServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new MessageSendServiceFileDescriptorSupplier())
                            .addMethod(getSendMethod())
                            .build();
                }
            }
        }
        return result;
    }
}

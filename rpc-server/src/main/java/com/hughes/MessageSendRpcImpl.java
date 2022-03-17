package com.hughes;

import com.hughes.protobuf.message.MessageSendServiceGrpc.MessageSendServiceImplBase;
import com.hughes.protobuf.message.SendRequest;
import com.hughes.protobuf.message.SendResponse;

import io.grpc.stub.StreamObserver;

/**
 * @author HughesLou
 * Created on 2022-03-09
 */
public class MessageSendRpcImpl extends MessageSendServiceImplBase {

    @Override
    public void send(SendRequest request, StreamObserver<SendResponse> responseObserver) {
        // 业务逻辑
        String content = request.getContent();
        System.out.println("server receive content=" + content);
        SendResponse response = SendResponse.newBuilder().setCode(0).setMessage("success").build();

        // 样板代码，把结果返回给客户端
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
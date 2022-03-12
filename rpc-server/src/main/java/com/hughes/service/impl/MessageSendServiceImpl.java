package com.hughes.service.impl;

import com.hughes.protobuf.message.MessageSendServiceGrpc;
import com.hughes.protobuf.message.MessageSendServiceGrpc.MessageSendServiceBlockingStub;
import com.hughes.protobuf.message.SendRequest;
import com.hughes.protobuf.message.SendResponse;
import com.hughes.service.MessageSendService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author HughesLou <luzhiwei@kuaishou.com>
 * Created on 2022-03-09
 */
public class MessageSendServiceImpl implements MessageSendService {

    private static final MessageSendServiceBlockingStub messageSendServiceBlockingStub;

    static {
        // server的地址
        String target = "localhost:50052";

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();
        messageSendServiceBlockingStub = MessageSendServiceGrpc.newBlockingStub(channel);
    }

    @Override
    public SendResponse send(SendRequest request) {
        return messageSendServiceBlockingStub.send(request);
    }
}

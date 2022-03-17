package com.hughes.service;

import com.hughes.protobuf.message.SendRequest;
import com.hughes.protobuf.message.SendResponse;
import com.hughes.service.impl.MessageSendServiceImpl;

/**
 * @author HughesLou
 * Created on 2022-03-09
 */
public interface MessageSendService {

    SendResponse send(SendRequest request);

    static MessageSendService getClient() {
        return new MessageSendServiceImpl();
    }
}

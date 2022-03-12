package com.hughes;

import java.util.concurrent.TimeUnit;

import com.hughes.protobuf.message.SendRequest;
import com.hughes.protobuf.message.SendResponse;
import com.hughes.service.MessageSendService;

/**
 * @author HughesLou <luzhiwei@kuaishou.com>
 * Created on 2022-03-09
 */
public class Client {

    private static final MessageSendService MESSAGE_SEND_SERVICE = MessageSendService.getClient();

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            SendRequest message = SendRequest.newBuilder().setContent("" + i).build();
            SendResponse response = MESSAGE_SEND_SERVICE.send(message);
            System.out.println(response);
            Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        }
    }
}
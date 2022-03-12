package com.hughes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author HughesLou <luzhiwei@kuaishou.com>
 * Created on 2022-03-09
 */
public class RpcServer {
    private static final Logger logger = Logger.getLogger(RpcServer.class.getName());

    private Server server;

    private void start() throws IOException {
        int port = 50052;
        server = ServerBuilder.forPort(port)
                .addService(new MessageSendRpcImpl())
                .build()
                .start();
        logger.info("RpcServer start with port=" + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                RpcServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("server shutdown");
        }));
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(1, TimeUnit.MINUTES);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final RpcServer server = new RpcServer();
        server.start();
        server.blockUntilShutdown();
    }
}
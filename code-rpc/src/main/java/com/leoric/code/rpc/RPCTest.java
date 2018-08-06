package com.leoric.code.rpc;

import java.net.InetSocketAddress;

/**
 * Created by wecash on 18/8/6.
 */
public class RPCTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Server serviceServer = new ServerCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        HelloService service = RpcClient.
                getRemoteProxyObj(HelloService.class,
                        new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
    }
}

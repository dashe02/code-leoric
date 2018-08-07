package com.leoric.code.rpc;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by wecash on 18/8/7.
 */
public class Test {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostAddress());
    }
}

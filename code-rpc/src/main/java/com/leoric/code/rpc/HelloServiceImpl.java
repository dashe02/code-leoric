package com.leoric.code.rpc;

/**
 * Created by wecash on 18/8/6.
 */
public class HelloServiceImpl implements HelloService {

    public String sayHi(String name) {
        return "Hi," + name;
    }
}

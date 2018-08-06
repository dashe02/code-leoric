package com.leoric.code.async.thread;

/**
 * Created by wecash on 18/8/3.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Resource resource = new Resource();
        AThread aThread = new AThread(resource);
        AThread.BThread bThread = new AThread.BThread(resource);
        Thread a = new Thread(aThread);
        a.start();
        Thread b = new Thread(bThread);
        b.start();
    }
}

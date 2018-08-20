package com.leoric.code.in.java.syn;

/**
 * Created by wecash on 18/8/17.
 */
public class SynTest {

    public static void main(String[] args) {
        SynTest synTest = new SynTest();
        synTest.test();
    }

    private synchronized void test() {
        System.out.println("test");
    }
}

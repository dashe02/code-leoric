package com.leoric.code.async.pc;

/**
 * Created by wecash on 18/8/3.
 */
public class PCTest {
    public static void main(String[] args) {
        CommonResourceV2 commonResource = new CommonResourceV2();
        Producer producer = new Producer(commonResource);
        Consume consume = new Consume(commonResource);
        producer.start();
        consume.start();
    }
}

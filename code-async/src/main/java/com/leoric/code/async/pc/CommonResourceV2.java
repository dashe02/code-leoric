package com.leoric.code.async.pc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by wecash on 18/8/3.
 */
public class CommonResourceV2 {

    private BlockingQueue<Integer> blockingQueue =
            new ArrayBlockingQueue<Integer>(10);

    public void produce() {
        try {
            while (true) {
                blockingQueue.put(1);
                System.out.println("生产了一个");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void consume() {
        try {
            while (true){
                Integer value = blockingQueue.take();
                System.out.println("消费了一个:" + value);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

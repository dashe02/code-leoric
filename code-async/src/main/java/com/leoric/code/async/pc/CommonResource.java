package com.leoric.code.async.pc;

/**
 * Created by wecash on 18/8/3.
 */
public class CommonResource {

    private int commonResource = 0;

    public void produce() {
        synchronized (this) {
            while (true) {
                if (commonResource >= 10) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                commonResource++;
                System.out.println("生产资源:" + commonResource);
                notifyAll();
            }
        }
    }

    public void consume() {
        synchronized (this) {
            while (true) {
                if (commonResource <= 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                commonResource--;
                System.out.println("消费资源:" + commonResource);
                notifyAll();
            }
        }
    }
}

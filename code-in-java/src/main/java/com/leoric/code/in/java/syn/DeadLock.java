package com.leoric.code.in.java.syn;

/**
 * Created by wecash on 18/9/20.
 */
public class DeadLock {

    //A锁
    private Object lockA = new Object();

    //B锁
    private Object lockB = new Object();

    public void test() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA) {
                    try {
                        Thread.sleep(1000);
                        //System.out.println("处理任务A");
                        synchronized (lockB) {
                            Thread.sleep(1000);
                            System.out.println("处理任务B");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    try {
                        Thread.sleep(1000);
                        //System.out.println("处理任务B");
                        synchronized (lockA) {
                            Thread.sleep(1000);
                            System.out.println("处理任务");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) {

        DeadLock deadLock = new DeadLock();

        deadLock.test();
    }
}

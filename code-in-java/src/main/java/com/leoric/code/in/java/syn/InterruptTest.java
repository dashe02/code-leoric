package com.leoric.code.in.java.syn;

/**
 * Created by wecash on 18/9/21.
 */
public class InterruptTest {

    public static void main(String[] args) {
        MyReadThread myReadThread=new MyReadThread();
        myReadThread.start();
        myReadThread.interrupt();

    }
}
class MyReadThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
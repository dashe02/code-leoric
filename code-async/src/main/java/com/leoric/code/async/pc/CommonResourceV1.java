package com.leoric.code.async.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wecash on 18/8/3.
 */
public class CommonResourceV1 {

    private int commonResource = 0;

    private ReentrantLock lock = new ReentrantLock();

    //没满 代表生产者运行
    private Condition notFull = lock.newCondition();

    //没空 代表消费者运行
    private Condition notEmpty = lock.newCondition();

    public void produce() {
        try {
            lock.lock();
            while (true) {
                if (commonResource >= 10) {
                    //满了,生产者停止
                    notFull.await();
                }
                commonResource++;
                System.out.println("生产:" + commonResource);
                notEmpty.signalAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consume() {
        try {
            lock.lock();
            while (true) {
                if (commonResource <= 0) {
                    //消费终止
                    notEmpty.await();
                }
                commonResource--;
                System.out.println("消费" + commonResource);
                notFull.signalAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}

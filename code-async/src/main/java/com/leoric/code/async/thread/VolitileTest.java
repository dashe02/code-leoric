package com.leoric.code.async.thread;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by wecash on 18/8/3.
 */
public class VolitileTest {

    private static volatile int commonResource = 0;

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        VolitileTest volitileTest = new VolitileTest();
        System.out.println("计算前:" + commonResource);
        volitileTest.test();
        System.out.println("耗时:" + (System.currentTimeMillis() - startTime) / 1000.0);
    }


    private void test() {
        List<Future<Object>> futureList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            Future<Object> future = executorService.submit(new Callable<Object>() {
                public Object call() throws Exception {
                    addOne();
                    return null;
                }
            });
            futureList.add(future);
        }
        for (Future<Object> future : futureList) {
            try {
                future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("计算后:" + commonResource);
    }

    private void addOne() {
        System.out.println(Thread.currentThread().getName() + ",当前commonResource:"
                + commonResource);
        commonResource++;
    }

}
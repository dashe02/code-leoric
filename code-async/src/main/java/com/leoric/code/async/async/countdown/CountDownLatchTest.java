package com.leoric.code.async.async.countdown;


import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.*;

/**
 * Created by wecash on 18/8/3.
 */
public class CountDownLatchTest {

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        CountDownLatchTest countDownLatchTest = new CountDownLatchTest();
        countDownLatchTest.test();
    }

    private void test() {
        List<String> resultList = Lists.newArrayList();
        final Context context = Context.builder()
                .resultList(resultList).latch(new CountDownLatch(10)).build();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                public void run() {
                    doOne(context);
                }
            });
        }
        try {
            boolean await = context.getLatch().await(2, TimeUnit.SECONDS);
            if (await) {
                System.out.println("list--" + context.getResultList());
                for (String result : context.getResultList()) {
                    System.out.println("结果:" + result);
                }
            } else {
                System.out.println("超时");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void doOne(Context context) {
        try {
            System.out.println(Thread.currentThread().getName() +
                    "----" + context.getLatch().getCount());
            Thread.sleep(5000);
            context.getResultList().add("test");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.getLatch().countDown();
        }
    }

}

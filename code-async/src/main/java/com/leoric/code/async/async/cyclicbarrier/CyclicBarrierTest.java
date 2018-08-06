package com.leoric.code.async.async.cyclicbarrier;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by wecash on 18/8/3.
 */
public class CyclicBarrierTest {

    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        CyclicBarrierTest cyclicBarrierTest = new CyclicBarrierTest();
        cyclicBarrierTest.test();
    }

    private void test() {
        List<String> resultList = Lists.newArrayList();
        final Context context = Context.builder().resultList(resultList).cyclicBarrier(new CyclicBarrier(10)).build();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                public void run() {
                    doWork(context);
                }
            });
        }
        try {
            int await = context.getCyclicBarrier().await(5, TimeUnit.SECONDS);
            System.out.println("await:" + await);
            List<String> result = context.getResultList();
            for (String s : result) {
                System.out.println("结果:" + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    private void doWork(Context context) {
        try {
            Thread.sleep(1000);
            context.getResultList().add("test");
            context.getCyclicBarrier().await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

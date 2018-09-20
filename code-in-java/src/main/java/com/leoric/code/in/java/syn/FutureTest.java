package com.leoric.code.in.java.syn;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by wecash on 18/9/20.
 */
public class FutureTest {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        BlockingQueue<Future<String>> queue = new LinkedBlockingQueue<>(10);

        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<String>(executorService, queue);

        for (int i = 0; i < 10; i++) {
            completionService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    int sleepTime = new Random().nextInt(1000);
                    Thread.sleep(sleepTime);
                    return "线程睡了" + sleepTime + "秒";
                }
            });
        }

        for (int i = 0; i < 10; i++) {
            Future<String> future = completionService.take();
            String result = future.get();
            System.out.println(result);
        }

    }
}

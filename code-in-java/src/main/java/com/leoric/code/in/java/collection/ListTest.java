package com.leoric.code.in.java.collection;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wecash on 18/11/7.
 */
public class ListTest {

    //List并发下会存在问题,多线程读写出现java.util.ConcurrentModificationException

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new ReadThread(list));
            executorService.execute(new WriteThread(list));
        }
    }

}

class ReadThread implements Runnable {

    private List<String> list;

    public ReadThread(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (String e : list) {
            System.out.println(e);
        }
    }
}

class WriteThread implements Runnable {

    private List<String> list;

    public WriteThread(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        this.list.add("11");
    }
}

package com.leoric.code.async.thread;

/**
 * Created by wecash on 18/8/3.
 */
public class Resource {

    public int resource = 0;

    public void addOne() {
        resource++;
        System.out.println("当前值" + resource);
    }
}

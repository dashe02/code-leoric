package com.leoric.code.in.java;

/**
 * Created by wecash on 18/7/28.
 */
public class Test {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //System.out.println(1 << 29);
        System.out.println(-1<<29);
        System.out.println(0<<29);
        System.out.println(1<<29);
        System.out.println(2<<29);
        System.out.println(3<<29);
        System.out.println(-536870912 | 0);
    }
}

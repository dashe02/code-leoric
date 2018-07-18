package com.leoric.code.design.pattern.singleton;

/**
 * Created by wecash on 18/7/18.
 * 懒汉式
 */
public class Singleton2 {

    public static Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

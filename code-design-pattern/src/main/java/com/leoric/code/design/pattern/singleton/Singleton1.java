package com.leoric.code.design.pattern.singleton;

/**
 * Created by wecash on 18/7/18.
 * 饿汉式
 */
public class Singleton1 {

    public static Singleton1 singleton1=new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}

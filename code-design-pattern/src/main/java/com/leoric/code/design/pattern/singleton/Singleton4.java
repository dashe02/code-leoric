package com.leoric.code.design.pattern.singleton;

/**
 * Created by wecash on 18/7/18.
 */
public class Singleton4 {

    private static class singletonHandler {
        private static Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getSingleton4() {
        return singletonHandler.singleton4;
    }
}

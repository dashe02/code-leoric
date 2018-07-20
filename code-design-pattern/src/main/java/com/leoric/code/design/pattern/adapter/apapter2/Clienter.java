package com.leoric.code.design.pattern.adapter.apapter2;

/**
 * Created by wecash on 18/7/19.
 */
public class Clienter {

    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}

package com.leoric.code.design.pattern.adapter.adapter3;

/**
 * Created by wecash on 18/7/19.
 */
public class AShili extends Adapter {

    public void a() {
        System.out.println("实现A方法被调用");
    }

    @Override
    public void d() {
        System.out.println("实现d方法被调用");
    }
}

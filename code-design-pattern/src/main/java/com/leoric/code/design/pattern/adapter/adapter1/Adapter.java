package com.leoric.code.design.pattern.adapter.adapter1;

/**
 * Created by wecash on 18/7/19.
 */
public class Adapter extends Usber implements Ps2 {

    public void isPs2() {
        isUsb();
    }
}

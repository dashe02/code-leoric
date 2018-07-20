package com.leoric.code.design.pattern.adapter.apapter2;

/**
 * Created by wecash on 18/7/19.
 */
public class Adapter implements Ps2{

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    public void isPs2() {
        usb.isUsb();
    }
}

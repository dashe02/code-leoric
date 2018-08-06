package com.leoric.code.async.pc;

/**
 * Created by wecash on 18/8/3.
 */
public class Consume extends Thread {

    private CommonResourceV2 commonResource;

    public Consume(CommonResourceV2 commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        commonResource.consume();
    }
}

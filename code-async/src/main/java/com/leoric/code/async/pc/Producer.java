package com.leoric.code.async.pc;

/**
 * Created by wecash on 18/8/3.
 */
public class Producer extends Thread {

    private CommonResourceV2 commonResource;

    public Producer(CommonResourceV2 commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        commonResource.produce();
    }
}

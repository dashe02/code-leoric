package com.leoric.code.async.thread;

/**
 * Created by wecash on 18/8/3.
 */
public class AThread implements Runnable {

    private Resource resource;

    public AThread(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.addOne();
    }

    /**
     * Created by wecash on 18/8/3.
     */
    public static class BThread implements Runnable {

        private Resource resource;

        public BThread(Resource resource) {
            this.resource = resource;
        }

        public void run() {
            resource.addOne();
        }
    }
}

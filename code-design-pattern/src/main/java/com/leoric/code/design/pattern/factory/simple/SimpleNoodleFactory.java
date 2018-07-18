package com.leoric.code.design.pattern.factory.simple;

/**
 * Created by wecash on 18/7/18.
 */
public class SimpleNoodleFactory {

    public final static int LZ_NOODLE = 1;

    public final static int PAO_NOODLE = 2;

    public final static int GANKOU_NOODLE = 3;

    public static INoodles createNoodle(int type) {
        switch (type) {
            case LZ_NOODLE:
                return new LzNoodles();
            case PAO_NOODLE:
                return new PaoNoodles();
            case GANKOU_NOODLE:
                return new GankouNoodles();
        }
        return null;
    }
}

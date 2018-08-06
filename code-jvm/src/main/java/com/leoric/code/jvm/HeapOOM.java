package com.leoric.code.jvm;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by wecash on 18/8/4.
 */
public class HeapOOM {

    static class OOMObjiect {

    }

    public static void main(String[] args) {
        List<OOMObjiect> oomObjiectList = Lists.newArrayList();
        while (true) {
            oomObjiectList.add(new OOMObjiect());
        }
    }
}

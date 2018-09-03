package com.leoric.code.in.java.base;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wecash on 18/8/31.
 */
public class SortDemo {


    public static void main(String[] args) {
        System.out.println("-----------默认 排序结果--------------");
        createDefaultSortTreeMap();
        System.out.println("-----------自定义 排序结果---------------");
        createDefinitionSortTreeMap();

        ExecutorService executorService= Executors.newFixedThreadPool(10);
    }

    private static void createDefaultSortTreeMap() {
        TreeMap<String, String> map = new TreeMap<>();
        init(map);
        print(map);
    }


    private static void init(Map<String, String> map) {
        map.put("c", "1");
        map.put("a", "1");
        map.put("bb", "1");
        map.put("b", "1");
    }

    private static void print(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());
        }

    }

    private static void createDefinitionSortTreeMap() {
        TreeMap<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        init(map);
        print(map);

    }
}

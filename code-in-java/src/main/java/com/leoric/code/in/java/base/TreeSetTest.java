package com.leoric.code.in.java.base;

import java.util.TreeSet;

/**
 * Created by wecash on 18/8/31.
 */
public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<Person> ts = new TreeSet<>(new CompareByAge());
        ts.add(new Person("张三", 23));
        ts.add(new Person("李四", 13));
        ts.add(new Person("周七", 13));
        ts.add(new Person("王五", 43));
        ts.add(new Person("赵六", 33));
        System.out.println(ts);
    }
}

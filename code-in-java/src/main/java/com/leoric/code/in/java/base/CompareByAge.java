package com.leoric.code.in.java.base;

import java.util.Comparator;

/**
 * Created by wecash on 18/8/31.
 */
public class CompareByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}

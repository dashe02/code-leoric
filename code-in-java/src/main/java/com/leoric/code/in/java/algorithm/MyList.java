package com.leoric.code.in.java.algorithm;

/**
 * Created by wecash on 18/9/20.
 */
public interface MyList<T> {

    void add(T t);

    T get(int index);

    void reserve(MyList<T> myList);

    T remove(int index);

    int size();

    void add(int index,T t);
}

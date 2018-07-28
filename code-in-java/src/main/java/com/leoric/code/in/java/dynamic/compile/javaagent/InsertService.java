package com.leoric.code.in.java.dynamic.compile.javaagent;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wecash on 18/7/28.
 */
public class InsertService {

    /**
     * 模拟数据插入
     * @param num
     */
    public void insert2(int num){
        List<Integer>list = new LinkedList<Integer>();
        for (int i =0;i<num;i++){
            list.add(i);
        }
    }

    public void insert1(int num){
        List<Integer>list = new LinkedList<Integer>();
        for (int i =0;i<num;i++){
            list.add(i);
        }
    }

    public void insert3(int num){
        List<Integer> list = new LinkedList<Integer>();
        for (int i =0;i<num;i++){
            list.add(i);
        }
    }
}

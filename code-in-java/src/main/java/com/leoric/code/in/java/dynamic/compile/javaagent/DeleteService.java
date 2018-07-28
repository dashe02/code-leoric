package com.leoric.code.in.java.dynamic.compile.javaagent;

import java.util.List;

/**
 * Created by wecash on 18/7/28.
 */
public class DeleteService {

    public void delete(List<Integer> list){
        for (int i=0;i<list.size();i++){
            list.remove(i);
        }
    }
}

package com.leoric.code.in.java.algorithm;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by wecash on 18/9/12.
 */
public class FindSumInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 7, 8, 0, 4};
        int x = 8;
        findSumInArray(arr, x);
    }

    private static void findSumInArray(int[] arr, int x) {
        Map<Integer, Integer> tempMap = preProcess(arr, x);
        Map<Integer, Integer> resultMap = Maps.newHashMap();
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            if (tempMap.get(target) == null) {
                continue;
            }
            resultMap.put(target,tempMap.get(target));
        }
        System.out.println(resultMap);
        for (Map.Entry entry:resultMap.entrySet()){
            int key =(Integer) entry.getKey();
            int value =(Integer) entry.getValue();

        }
    }

    private static Map<Integer, Integer> preProcess(int[] arr, int x) {
        Map<Integer, Integer> hashMap = Maps.newHashMap();
        for (int i = 0; i < arr.length; i++) {
            int temp = x - arr[i];
            hashMap.put(temp, arr[i]);
        }
        return hashMap;
    }

}

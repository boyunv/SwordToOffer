package com.Grammer.冒泡排序;

import java.util.Arrays;

public class BubbleSort003 {
    public void bubbleSort(int[] arr){
        //1.判断数组合法性
        if(arr==null){
            throw new RuntimeException("传入的数组为空");
        }
        //2.进行判断排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                }
            }
        }
        Arrays.toString(arr);
    }
}

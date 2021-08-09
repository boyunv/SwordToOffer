package com.Grammer.选择排序;

public class SelectSort {
    public void sort(int[] arr){
        //1.判断合法性
        if(arr==null){
            throw new RuntimeException("程序不合法");
        }
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            int min=i;
            for (int j = i; j < len; j++) {
                if(arr[j]>arr[min]){
                    min=j;
                }
            }
            arr[i]=arr[i]^arr[min];
            arr[min]=arr[i]^arr[min];
            arr[i]=arr[i]^arr[min];

        }
    }
}

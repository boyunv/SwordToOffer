package com.Grammer.冒泡排序;

/**
 * 将两个元素进行比较小的上前
 */
public class bubbleSort {
    //第一种写法
        public int[] bubbleSort(int[] arr){
           int len=arr.length;
           int temp;
            for (int i = 0; i < len-1; i++) {
                for (int j = 0; j < len - 1 - i; j++) {
                    if(arr[j]>arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            return arr;
        }

        //第二种写法
    
}

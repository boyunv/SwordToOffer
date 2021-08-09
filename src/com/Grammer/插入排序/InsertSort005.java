package com.Grammer.插入排序;

public class InsertSort005 {
    public void sort(int[] arr){
        //1.judge  illegal
        if(arr==null){
            throw new RuntimeException("array is illegal!");
        }
        int len=arr.length;
        //遍历排序
        for (int i = 0; i < len; i++) {
            int temp=arr[i];
            int j=i;
            while(j>0&&arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
}

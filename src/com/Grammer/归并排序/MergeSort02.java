package com.Grammer.归并排序;

import java.awt.print.PrinterAbortException;
import java.util.Arrays;

public class MergeSort02 {
    public static void main(String[] args) {
        int len=10;
        int[] arr=new int[len];
        for (int i = 0; i < len - 1; i++) {
            arr[i]= (int) (Math.random()*100);
        }
        System.out.println("原始的数组"+ Arrays.toString(arr));
        //进行排序的操作
        sort(arr);
        System.out.println("完成的数组"+ Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        if(arr.length==0||arr.length==1){
            return;
        }
        //创建 临时数组
        int[] temp=new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
            if(arr[i]<arr[j]){
                temp[t++]=arr[i++];
            }else{
                temp[t++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[t++]=arr[i++];
        }
        while (j<=right){
            temp[t++]=arr[j++];

        }
        t=0;
        while(left<=right){
            arr[left++]=temp[t++];
        }
    }
}

package com.Grammer.快速排序;

import java.util.Arrays;

public class Quicksort000 {
    public static void main(String[] args) {
        int[] arr=new int[]{6,1, 2, 7 ,9,3,4,5,10,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int low,int high){
        int p,i,j,temp;
        if(low>=high){
            return;
        }
        //p是基准
        p=arr[low];
        i=low;
        j=high;
        //哨兵j进行循环
        while(i<j){
            //右边发现小于p的值循环停止
            while(arr[j]>=p&&i<j){
                j--;
            }
            //左边的哨兵查找比自己大的
            while (arr[i]<=p&&i<j){
                i++;
            }
            arr[i]=arr[i]^arr[j];
            arr[j]=arr[i]^arr[j];
            arr[i]=arr[i]^arr[j];
        }
        arr[low]=arr[i];
        arr[i]=p;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }
}

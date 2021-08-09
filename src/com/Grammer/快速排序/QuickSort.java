package com.Grammer.快速排序;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] a,int low,int high){
        int i,j,index;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //基准数
        index=a[i];
        //哨兵的来回巡逻进行遍历
        while (i<j){
            while(i<j&&a[j]>=index){
                j--;
            }
            if(i<j){
                a[i++]=a[j];
            }
            while (i<j&&a[i]<index){
                i++;
            }
            if(i<j){
                a[j--]=a[i];
            }
        }
        a[i]=index;
        sort(a,low,i-1);
        sort(a,i+1,high);
    }
    public static void quickSort(int[] a){
        sort(a,0,a.length-1);
    }

    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < a.length-1; i++) {
            a[i]= (int) (Math.random()*100);
        }
        System.out.println("原先的数组"+ Arrays.toString(a));
        quickSort(a);
        System.out.println("快排后的的数组"+ Arrays.toString(a));
    }
}

package com.Grammer.归并排序;

import com.sun.scenario.effect.Merge;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * 创建自己的归并排序
 */
public class MergeSort01 {
    //创建随机的数组


    public static void main(String[] args) {
        int len=10;
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]= (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int[] temp=new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }
    public static void sort(int[] arr,int left,int right,int[] temp){
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
            if (arr[i] <= arr[j]) {
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
        //进行初始化回来
        t=0;
        while (left<=right){
            arr[left++]=temp[t++];
        }
    }
}

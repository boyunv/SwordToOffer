package com.Grammer.归并排序;

import java.util.Arrays;

/*
* 采用分而治之的思想
* 利用完全二叉树的性质
* */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,11,22,44,33,7,91,909,66,55,77,66};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        //避免频繁开辟空间,建立长度等于原数组长度的临时数组
        int[] temp=new int[arr.length];
        //进行分而治之的排序
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(int[] arr,int left,int right,int[] temp){
        if (left<right){
            int mid=(left+right)/2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        //左序列指针
        int i=left;
        //右序列指针
        int j=mid+1;
        //临时数组指针
        int t=0;
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[t++]=arr[i++];
            }else{
                temp[t++]=arr[j++];
            }
        }
        while (i<=mid){
            temp[t++]=arr[i++];

        }
        while(j<=right){
            temp[t++]=arr[j++];
        }
        t=0;
        //进行原数组的拷贝
        while (left<=right){
            arr[left++]=temp[t++];
        }


    }
}

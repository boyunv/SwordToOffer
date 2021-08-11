package com.Grammer.插入排序;

import com.swordToOffer.Array;

import java.util.Arrays;

public class InsertSort004 {
    public static void main(String[] args) {
        int[] arr={52,10,36,96,2,46,87,15};
        InsertSort004 insertSort004 = new InsertSort004();
        insertSort004.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //采用移动法进行插入排序O(n^2)
    public void sort(int[] arr){
        //1.judge数组的合法性
        if(arr==null){
            throw new RuntimeException("Arrays  is  Illegal");
        }
        int len=arr.length;
        //ToDo:自己没有加上
        if(len>0){
            for (int i = 0; i <len ; i++) {
                int j=i;
                int temp=arr[i];
                //j>0:保证所有的遍历都能被移动找到比他小的元素
                while(j>0&&arr[j-1]>temp){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=temp;
            }
        }

    }
}

package com.Grammer.插入排序;

import java.util.ArrayList;

public class InsertOrder {
   /* public  int[] insertOrder(int[] arr){
        int len=arr.length;
        int pre_index;
        int current;
        for (int i = 1; i <len ; i++) {
            pre_index=i-1;
            current=arr[i];
            while (pre_index>=0&&arr[pre_index]>current){
                arr[pre_index+1]=arr[pre_index];
                pre_index--;
            }
            *//*这里面的pre_index+1相当于原来的current的位置*//*
            arr[pre_index+1]=current;
        }
        return arr;
    }*/


    public int[] insertOrder(int[] array){
        int len=array.length;
        int pre_index,current;
        for (int i = 1; i < len; i++) {
            pre_index=i-1;
            current=array[i];
            while (pre_index >= 0 && array[pre_index]>current) {
                array[pre_index+1]=array[pre_index];
                pre_index--;
            }
            array[pre_index+1]=current;
        }
        return array;
    }
}


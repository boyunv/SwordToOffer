package com.Grammer.插入排序;

public class InsertSort004 {
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

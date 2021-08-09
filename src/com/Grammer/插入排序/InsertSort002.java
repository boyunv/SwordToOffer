package com.Grammer.插入排序;

public class InsertSort002 {
    private int[] arr;
    public InsertSort002(int[] arr){
        this.arr=arr;
    }
    public void sort(){
        //1.判断是否为空
        if(arr==null){
            throw new RuntimeException("数组为空");
        }
        //2.提取数组长度
        int length=arr.length;
        //判断条件
        if(length>0){
            for (int i = 0; i < length; i++) {
                int j=i;
                int temp=arr[i];
                while(j>0&&arr[j-1]>temp){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=temp;
            }
        }
    }
}

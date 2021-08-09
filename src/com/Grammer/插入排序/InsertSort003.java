package com.Grammer.插入排序;

import java.util.Random;

public class InsertSort003 {
    private int[] arr;
    public InsertSort003(int[] arr){
        this.arr=arr;
    }
    //1.judge whether  is  arr null?
    public void sort(){
        if(arr==null){
            throw new RuntimeException("数组为孔梅花");
        }
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            int j=i;
            int temp=arr[i];
            while(j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr=new  int[10];
        Random random=new Random(1);
        for (int i = 0; i <10; i++) {
            arr[i]=random.nextInt(100);
        }
        InsertSort003 sort=new InsertSort003(arr);
        sort.sort();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

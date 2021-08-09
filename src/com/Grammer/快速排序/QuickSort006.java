package com.Grammer.快速排序;

public class QuickSort006 {
    public void sort(int[] arr){
        if(arr==null){
            throw new RuntimeException("传入的数组为空");
        }
        quickSort(arr,0,arr.length-1);
    }

    private void quickSort(int[] arr, int begin, int end) {
        //1.确定基准数和定义左右哨兵
        int key=arr[begin];
        int i=begin;
        int j=end;
        //2.始终保持i<j
        if(i<j){
            while(i<j&&arr[j]>key){
                j--;
            }
            if(i<j){
                arr[j]=arr[i];
                //此处为i++,因为置换的数一定是比基准数key小的,没有必要再比较一次,加一减少当中的操作
                i++;
            }
            while(i<j&&arr[i]<key){
                i++;
            }
            if(i<j){
                arr[i]=arr[j];
                //当中的j--同上
                j--;
            }
        }
        arr[i]=key;
        quickSort(arr,0,i-1);
        quickSort(arr,i+1,end);
    }
}

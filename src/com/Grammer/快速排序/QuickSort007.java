package com.Grammer.快速排序;



public class QuickSort007 {
    public void sort(int[] arr){
        //要加 判断条件
        if(arr==null){
            throw new RuntimeException("数组传入为空");
        }
        quickSort(arr,0,arr.length-1);
    }

    private void quickSort(int[] arr, int begin, int end) {
        //1.确定基准数,左右哨兵
        int key=arr[begin];
        int i=begin;
        int j=end;
        //2.judge :左哨兵<右哨兵
        if(i<j){
            //3.首先遍历右哨兵
            while(i<j&&arr[j]>key){
                j--;
            }
            if(i<j){
                arr[j]=arr[i];
               i++;
            }
            while(i<j&&arr[i]<key){
                i++;
            }
            if(i<j){
                arr[i]=arr[j];
                j--;
            }
        }
        arr[i]=key;
        quickSort(arr,begin,i-1);
        quickSort(arr,i+1,end);
    }
}

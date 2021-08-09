package com.Grammer.快速排序;

import java.util.Arrays;

public class quickSort005 {

    public void sort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    private void quickSort(int[] arr, int begin, int end) {
        //begin和end代表哨兵
        //1.判断左边的哨兵是否大于右边的哨兵
        if(begin<end){
            //1.确定基准数
            int key=arr[begin];
            //左边哨兵
            int i=begin;
            //右边哨兵
            int j=end;
            //2.始终左<右
            while(i<j){
                //右边的哨兵大于基准数,持续递减遍历
                while(i<j&&arr[j]>key){
                    j--;
                }
                //
                if(i<j){
                    arr[i]=arr[j];
                    i++;
                }
                while(i<j&&arr[i]<key){
                    i++;
                }
                if(i<j){
                    arr[j]=arr[i];
                    j--;
                }
            }
            arr[i]=key;
            quickSort(arr,begin,i-1);
            quickSort(arr,i+1,end);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 1, 9, 5, 3, 7, 6, 1};
        quickSort005 qu=new quickSort005();
        qu.sort(array);
        System.out.println(Arrays.toString(array));

    }
}

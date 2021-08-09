package com.Grammer.希尔排序;

public class shellSort {
    public int[] shellSort(int[] arr){
        if(arr.length==0||arr.length==1){
            return arr;
        }
        int len=arr.length;
        int gap;
        for (gap= (int) Math.floor(len/2); gap>0; gap= (int) Math.floor(gap/2)) {
            for (int i=gap;i<len;i++){
                int j=i;
                int current=arr[i];
                while(j-gap>=0&&current<arr[j-gap]){
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=current;
            }

        }
        return arr;
    }
}

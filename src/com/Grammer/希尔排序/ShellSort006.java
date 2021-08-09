package com.Grammer.希尔排序;

public class ShellSort006 {

    public void sort(int[] arr){
        //1.judge legal
        if(arr==null){
            throw new RuntimeException("array  is illegal");
        }
        int len=arr.length;
        //2.确定希尔增量
        for(int gap=len<<2;gap>0;gap/=2){
            for(int i=gap;i<len;i++){
                int j=i;
                while(j-gap>0&&arr[j-gap]>arr[j]){
                    arr[j-gap]=arr[j-gap]^arr[gap];
                    arr[gap]=arr[j-gap]^arr[gap];
                    arr[j-gap]=arr[j-gap]^arr[gap];
                    j-=gap;
                }
            }
        }
    }
}

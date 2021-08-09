package com.Grammer.希尔排序;

public class  ShellSort005 {
    public static void main(String[] args) {

    }
    //进行数组的交换
    private void swap(int a,int b,int[] arr){
        arr[a]=arr[a]^arr[b];
        arr[b]=arr[a]^arr[b];
        arr[a]=arr[a]^arr[b];
    }
    //ShellSort  Swap
    public void sort(int[] arr){
        //进行希尔增量的确定
        for(int gap=arr.length/2;gap>0;gap/=2){
            for (int i=gap;i<arr.length;i++){
                int j=i;
                //进行判断的并转换的关键条件
                while(j-gap>=0&&arr[j]<arr[j-gap]){
                    swap(j,j-gap,arr);
                    //对于数组过长,进行遍历下个间隔GAP
                    j-=gap;
                }
            }

        }
    }
     //采用移动法
    public void sortMove(int[] arr){
        //确定增量GAP
        int len=arr.length;
        for(int gap=len/2;gap>0;gap/=2){
            for (int i = gap; i <len ; i++) {
                int j=i;
                int temp=arr[j];
                if(arr[j]<arr[j-gap]){
                    while(j-gap>=0&&temp<arr[j-gap]){
                        arr[j]=arr[j-gap];
                        j-=gap;
                    }
                    arr[j]=temp;
                }
            }
        }
    }

    public void shellSortSwap(int[] arr){
        int len=arr.length;
        //确定GAP
        for (int gap=len/2;gap>0;gap/=2){
            for(int i=gap;i<len;i++){
                int j=i;
                //判断的条件
                while(j-gap>=0&&arr[j]<arr[j-gap]){
                    swap(j,j-gap,arr);
                    j=j-gap;
                }
            }
        }
    }








}

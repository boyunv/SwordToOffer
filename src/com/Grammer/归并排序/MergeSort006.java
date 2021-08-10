package com.Grammer.归并排序;

public class MergeSort006 {
    //core
    public void merge(int[] arr,int left,int mid,int right){
        //1.建立临时数组
        int[] temp=new int[right-left+1];

        int t1=left,t2=mid+1;
        int index=0;
        //2.进行大小的比较,放入临时数组
        while(t1<=mid&&t2<=right){
            if (arr[t1] < arr[t2]) {
                temp[index++]=arr[t1++];
            }else{
                temp[index++]=arr[t2++];
            }
        }
        //3.将某一元素未完成的计集合元素放到大元素中
        if(t1<=mid){
            System.arraycopy(arr,t1,temp,index,mid-t1+1);
        }
        if(t2<=right){
            System.arraycopy(arr,t2,temp,index,right-t2+1);
        }
        System.arraycopy(temp,0,arr,0+left,right-left+1);
    }
    public void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+((right-left)>>1);
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public int[] sortArray(int[] nums){
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}

package com.Grammer.归并排序;

public class MergeSort004 {
    //归并核心
    public void merge(int[] arr,int left,int mid,int right){
        //1.建立一个临时数组
        int[] temparr=new int[right-left+1];
        int temp1=left,temp2=mid+1;
        int index=0;
        //2.比较,放入临时数组
        while(temp1<=mid&&temp2<=right){
            if(arr[temp1]<arr[temp2]){
                temparr[index++]=arr[temp1++];
            }else{
                temparr[index++]=arr[temp2++];
            }
        }
        //3.将某某一小集合元素剩余元素存到大元素中
        if(temp1<=mid){
            System.arraycopy(arr,temp1,temparr,index,mid-temp1+1);
        }
        if(temp2<=right){
            System.arraycopy(arr,temp2,temparr,index,right-temp2+1);

        }
        System.arraycopy(temparr,0,arr,0+left,right-left+1);
    }
    public void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+((right-left)>>1);
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public int[]  sortArray(int[] nums){
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}

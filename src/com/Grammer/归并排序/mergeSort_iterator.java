package com.Grammer.归并排序;

public class mergeSort_iterator {
    class Solution{
        public int[] sortArray(int[] nums){
            //子集合按照2幂次方递增
            int k=1;
            int len=nums.length;
            while(k<len){
                mergePass(nums,k,len);
                k*=2;
            }
            return nums;
        }
    public  void mergePass(int[] arr, int k, int len) {
        int j;
        for (j = 0; j < len-2*k; j+=2*k) {
            //归并
            merge(arr,j,j+k-1,j+2*k-1);
        }
        //归并最后两个子序列
        if(j+k<len){
            merge(arr,j,j+k-1,len-1);
        }
    }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        //1.定义一个临时数组
        int[] temp=new int[right-left+1];
        int temp1=left,temp2=mid+1;
        int index=0;
        //2.比较每个指针指向的值,小的存入集合
        while(temp1<=mid&&temp2<=right){
            temp[index++]=arr[temp1]<arr[temp2]?arr[temp1++]:arr[temp2++];
        }
        //剩余元素合并
        if(temp1<=mid) System.arraycopy(arr,temp1,temp,index,mid-temp1+1);
        if(temp2<=right) System.arraycopy(arr,temp2,temp,index,right-temp2+1);
        //复制回原数组
        System.arraycopy(temp,0,arr,0+left,right-left+1);
    }
}

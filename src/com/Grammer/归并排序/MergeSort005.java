package com.Grammer.归并排序;

public class MergeSort005 {
    //core:a,l,m,r
    public void merge(int[] arr,int l,int m,int r ){
        //1.建立临时数组
        int[] tempArr=new int[r-l+1];
        int t1=l,t2=m+1;
        int index=0;
        //2.进行大小的比较,放入临时数组
        while(t1<=m&&t2<=r){
            if(arr[t1]<arr[t2]){
                tempArr[index++]=arr[t1++];
            }else{
                tempArr[index++]=arr[t2++];
            }
        }
        //3.将某一集合元素未完成的剩余元素放在大元素集合中
        if(t1<=m){
            System.arraycopy(arr,t1,tempArr,index,m-t1+1);
        }
        if(t2<=r){
            System.arraycopy(arr,t2,tempArr,index,r-t2+1);
        }
        System.arraycopy(tempArr,0,arr,0+l,r-l+1);

    }
    public void mergeSort(int[] arr,int l,int r){
        if(l<r){
            int m=l+((r-l)>>1);
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public int[] sortArray(int[] nums){
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}

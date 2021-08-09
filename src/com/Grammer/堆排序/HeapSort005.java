package com.Grammer.堆排序;

public class HeapSort005 {
    public void sort(int[] arr){
        //1.判断arr数组合法性
        if(arr==null){
            throw new RuntimeException("数组为空");
        }
        //2.数组长度
        int len=arr.length;
        //3.构造大顶堆
        for (int i =len/2-1;i>0 ;i--) {
            //4.调整机构
            adjustHeap(arr,i,len);
        }
        //4.调整元素+交换元素
        for (int i = len-1; i >0 ; i--) {
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }

    private void swap(int[] arr, int head, int end) {
        arr[head]=arr[head]^arr[end];
        arr[end]=arr[head]^arr[end];
        arr[head]=arr[head]^arr[end];

    }

    //调整规则:从下到上,从左到右以第一个非叶子节点开始
    private void adjustHeap(int[] arr, int node, int len) {
        //1.存储父节点
        int  temp=arr[node];
        //2.遍历循环比较
        for (int i = node*2+1; i < len; i=i*2+1) {
            if(i+1<len&&arr[i]<arr[i+1]){
                i++;
            }
            if(arr[i]>temp){
                arr[node]=arr[i];
                node=i;
            }else{
                break;
            }
        }
        arr[node]=temp;
    }
}

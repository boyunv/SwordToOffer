package com.Grammer.堆排序;

import java.util.concurrent.ForkJoinPool;

public class HeapSort003 {
    //堆排序
    public  void sort(int[] arr){
        //1.判断arr的合法性
        if(arr==null){
            throw new RuntimeException("数组为空");
        }
        //2.数组长度
        int len=arr.length;
        //3.构造大顶堆
        for (int i = len/2-1; i >=0; i--) {
            //调用调整结构的方法---规则:按照第一个非叶子节点从下往上,从右至左调整
            adjustHeap(arr,i,len);
        }
        //4.调整堆结构,交换堆顶元素与末尾元素
        for(int j=len-1;j>0;j--){
            //5.交换末尾元素与堆顶元素
            swap(arr,0,j);
            //6.重新调整堆,
            adjustHeap(arr,0,j);
        }
    }

    private void swap(int[] arr, int i, int j) {
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

    private void adjustHeap(int[] arr, int i, int len) {
        //1.创建临时存储区,将arr[i]进行临时的存储
        int temp=arr[i];
        //2.从i节点左子结点开始(2i+1)节点---就是最后一个节点
        for (int k=i*2+1;k<len;k=2*k+1){
            //如果左子结点小于右子结点，k指向右子结
            if(k+1<len&&arr[k]<arr[k+1]){
                k++;
            }
            //如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
            if (arr[k]>temp){
                arr[i]=arr[k];
                i=k;
            }
        }
        arr[i]=temp;
    }
}

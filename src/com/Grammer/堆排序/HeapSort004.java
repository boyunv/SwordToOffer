package com.Grammer.堆排序;

public class HeapSort004 {
    public void sort(int[] arr){
        //1.判断数组合法性
        if(arr==null){
            throw new RuntimeException("数组为空");
        }
        //2.数组长度
        int len=arr.length;
        //3.构建大顶堆
        for(int i=len/2-1;i>=0;i--){
            //4.调整结构
            adjustHeap(arr,i,len);
        }
        //4.调整堆结构+交换对顶元素与末尾元素
        for (int i=len-1; i>0 ; i--) {
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }

    private void swap(int[] arr, int head, int tail) {
        arr[head]=arr[head]^arr[tail];
        arr[tail]=arr[head]^arr[tail];
        arr[head]=arr[head]^arr[tail];
    }

    //调整规则:从下到上,从右到左;以第一个非叶子节点开始
    private void adjustHeap(int[] arr, int i, int len) {
        //(1).取出当前父节点(缓冲的作用)
        int temp=arr[i];
        //(2).从此节点的叶子节点进行
        //j=j*2+1:始终遍历左子结点
        for (int j = 2*i+1; j < len; j=j*2+1) {
            //(3).如果左子结点小于右子结点,k指向有节点
            if(j+1<len&&arr[j]<arr[j+1]){
                j++;
            }
            //(4).如果子结点大于父节点,将子结点赋值给父节点--不用进行交换
            if(arr[j]>temp){
                arr[i]=arr[j];
                i=j;
            }else{
                break;
            }
        }
        //将temp的值放到最终的位置
        arr[i]=temp;
    }
}

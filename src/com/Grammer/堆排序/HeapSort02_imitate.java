package com.Grammer.堆排序;



public class HeapSort02_imitate {
    //堆排序
    public static  void heapSort(int[] arr){
        //
        heapInsert(arr);

    }
    public static void heapInsert(int[] arr){
            //当前的插入序列
        for (int i = 0; i < arr.length; i++) {
            int currentIndex=i;
            //父节点的索引
            int fatherIndex=(currentIndex-1)/2;
            //当前插入的值大于 父节点的值,进行值的交换,并将索引指向父节点
            //继续和上面的父节点进行比较,直到不大于父节点,退出循环
            while (arr[currentIndex]>arr[fatherIndex]){
                //交换值
                swap(arr,currentIndex,fatherIndex);
                //架构索引指向父索引
                currentIndex=fatherIndex;
                //父索引指向父的父索引
                fatherIndex=(currentIndex-1)/2;
            }
        }

    }
    public static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[j]^arr[i];
        arr[i]=arr[i]^arr[j];
    }

    //构造大根堆
    public static void heapify(int[] arr){

    }
}

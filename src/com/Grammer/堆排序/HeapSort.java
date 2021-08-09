package com.Grammer.堆排序;

public class HeapSort {

    //堆排序
    public static void heapSort(int[] arr){
        //构造大根堆
        heapInsert(arr);
        int size=arr.length;
        while (size>1){
            //固定max
            swap(arr,0,size-1);
            size--;
            //构造大根堆
            heapify(arr,0,size-1);
        }
    }
    //构造大根堆(通过新插入的数上升)
    public static void heapInsert(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //当前插入的索引
            int currentIndex=i;
            //父节点索引
            int fatherIndex=(currentIndex-1)/2;
            //如果当前插入的值大于其父结点的值,则交换值，并且将索引指向父结点
            //然后继续和上面的父结点值比较，直到不大于父结点，则退出循环
            while (arr[currentIndex]>arr[fatherIndex]){
                //交换当前的节点与父节点的值
                swap(arr,currentIndex,fatherIndex);
                //当前索引的指向父索引
                currentIndex=fatherIndex;
                //重新计算当前的索引指向福索引
                fatherIndex=(currentIndex-1)/2;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
       arr[i]=arr[i]^arr[j];
       arr[j]=arr[i]^arr[j];
       arr[i]=arr[i]^arr[j];
    }
    //将剩余的数构造成大根堆
    public static void heapify(int[] arr,int index,int size){
        int left=2*index+1;
        int right=2*index+2;
        while (left<size){
            int largeestIndex;
            //判断孩子中较大值的索引
            if(arr[left]<arr[right]&&right<size){
                largeestIndex=right;
            }else{
                largeestIndex=left;
            }
            //比较父节点值与孩子中较大的值,并确定最大的索引
            if(arr[index]>arr[largeestIndex]){
                largeestIndex=index;
            }
            //如果父结点索引是最大值的索引，那已经是大根堆了，则退出循环
            if(index==largeestIndex){
                break;
            }
            //父结点不是最大值，与孩子中较大的值交换
            swap(arr,largeestIndex,index);
            //索引指向孩子中较大值索引
            index=largeestIndex;
            //重新计算交换之后的孩子索引
            left=2*index+1;
            right=2*index+2;
        }
    }

}

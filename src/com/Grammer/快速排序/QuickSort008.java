package com.Grammer.快速排序;

/**
 * 插入排序:采用以第一个数为基准数,设置首尾元素为哨兵元素,首次将末尾哨兵与基准值比较,大于基准值,末尾哨兵向前遍历,
 * 直到找到小于基准值的数,末尾哨兵与基准值互换,头部哨兵与基准值比较,小于基准值递增,若大于互换,继续重复上面的步骤
 * ,直至结束,快速排序完成
 */
public class QuickSort008 {
    private void quickSort(int[] arr,int start,int end){
        //1.设立基准值,左右哨兵
        int key=arr[start];
        int i=start,j=end;
        //2.设立大前前提---左哨兵始终小于右哨兵
        if(i<j){
            //3.进行右哨兵的遍历
            while(i<j&&arr[j]>key){
                j--;
            }
            //4.进行值互换,并让左哨兵加1为后面的值做准备
            if(i<j){
                arr[j]=arr[i];
                i++;
            }
            //5.进行左哨兵的遍历比较
            while(i<j&&arr[i]<key){
                i++;
            }
            //6.进行左哨兵的值互换
            if(i<j){
                arr[i]=arr[j];
                j--;
            }

        }
        //遍历结束,将基准值放到应该排序的位置
        arr[i]=key;
        quickSort(arr,start,i-1);
        quickSort(arr,i+1,end);
    }
    //快排函数
    public void sort(int[] arr){
        //判断数组是否为空
        if(arr==null){
            throw new RuntimeException("数组为空");
        }
        quickSort(arr,0,arr.length-1);
    }
}

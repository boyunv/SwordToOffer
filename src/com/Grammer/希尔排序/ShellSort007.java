package com.Grammer.希尔排序;

/**
 * 主要思想:
 *  按照希尔的增量把记录按下标的一定增量分组,对每组使用直接插入排序算法,随着增量的越来越小.
 *  每组包含的关键字越来越多,直到1为止,排序完成
 */
public class ShellSort007 {

//    采用交换法
    public void ShellSort(int[] arr){
        //确定增量gap,并发逐步缩小增量
        for(int gap=arr.length>>2;gap>0;gap/=2){
            //2.从第GAP个元素开始,逐个对每组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j=i;
                while(j-gap>=0&&arr[j]<arr[j-gap]){
                    //3.采用交换法进行排序
                    swap(arr,j,j-gap);
                    j-=gap;
                }
            }
        }
    }

    private void swap(int[] arr, int a, int b) {
        arr[a]=arr[a]^arr[b];
        arr[b]=arr[a]^arr[b];
        arr[a]=arr[a]^arr[b];
    }

//    采用移动法

}

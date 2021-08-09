package com.Grammer.选择排序;

/**
 * 关键点:寻找最小的值是本质
 */
public class selectOrder {
        public int[] selectSort(int[] arr){
            int min_index,temp;
            int len=arr.length;
            for (int i = 0; i < len; i++) {
                min_index=i;
                for (int j = i+1; j <len ; j++) {
                    if(arr[min_index]>arr[j]){
                        min_index=j;
                    }
                }
                temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
            return arr;
        }
}

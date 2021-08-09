package com.Grammer.希尔排序;

public class shellSort002 {
    public static void shellSort(int[] a,int n){
        //gap为步长
        for (int gap=n/2;gap>0 ; gap/=2) {
            //共gap组,对每一组执行插入的操作
            for (int i = 0; i < gap; i++) {
                for (int j = i+gap; j < n; j+=gap) {
                    if(a[j]<a[j-gap]){
                        int tmp=a[j];
                        int k=j-gap;
                        while(k>=0&&a[k]>tmp){
                            a[k+gap]=a[k];
                            k-=gap;
                        }
                        a[k+gap]=tmp;
                    }
                }
            }

        }
    }

    /**
     * 对希尔排序的单个数组进行排序
     */
    public static void groupSort(int[] a,int n,int i,int gap){
        for (int j = i+gap; j < n; j+=gap) {
            // 如果a[j] < a[j-gap]，则寻找a[j]位置，并将后面数据的位置都后移。
            if(a[j]<a[j-gap]){
                int tmp=a[j];
                int k=j-gap;
                while (k >= 0 && a[k]>tmp) {
                    a[k+gap]=a[k];
                    k-=gap;
                }
            }
        }
    }
}

package com.Grammer.希尔排序;

/*
 * 懵逼了呀，不想去思考
 * 心里难受
 *
 */

public class ShellSort004 {
    public void shellSort(int  a[],int len){
        int i,j,gap;
        //gap为步长
        for(gap=len/2;gap>0;gap/=2){
            //共gap个组，每组进行直接插入排序
            for(i=0;i<gap;i++){
                for(j=i+gap;j<len;j+=gap){
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
}

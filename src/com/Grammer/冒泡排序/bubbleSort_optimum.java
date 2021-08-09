package com.Grammer.冒泡排序;

public class bubbleSort_optimum {
    public void bubbleSort(int[] sums){
        int sign=0;
        boolean bubble=false;
        int len=sums.length;
        do{
            bubble=false;
            len-=1;
            for (int i = 0; i < len; i++) {
                if(sums[i]>sums[i+1]){
                    sign=sums[i];
                    sums[i]=sums[i+1];
                    sums[i+1]=sign;
                    bubble=true;
                }
            }
        }while (bubble);
    }
}

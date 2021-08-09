package com.swordToOffer;

public class Array {
    /**
     * 题目描述
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * [
     *   [1,2,8,9],
     *   [2,4,9,12],
     *   [4,7,10,13],
     *   [6,8,11,15]
     * ]
     * 给定 target = 7，返回 true。
     *
     * 给定 target = 3，返回 false。
     */
    //简单粗暴法
    public boolean judgeArrayNumber(int[][] array,int a){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==a)
                    return true;
            }
        }
        return false;
    }
    //进阶版(  二分查找)利用上面的递增思想
    public boolean judgeArrayNumber01(int[][] array,int a){
        int rows=array.length;
        if (rows==0){
            return false;
        }
        int cols=array[0].length;
        if (cols==0){
            return false;
        }
        int m=rows-1;
        int n=0;
        while (m>0&&n<cols){
            if(array[m][n]<a){
                n++;
            }else if(array[m][n]>a){
                m--;
            }else{
                return true;
            }
        }
        return false;
    }


}

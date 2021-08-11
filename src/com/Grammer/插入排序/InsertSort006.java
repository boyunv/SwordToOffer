package com.Grammer.插入排序;


import java.util.Arrays;

/**
 * 插入排序:
 *        从第一行元素开始,逐个与后面的元素比较比此元素小的进行替换,其他元素重复此步骤
 *        O(n):n^2
 */
public class InsertSort006 {
    public static void main(String[] args) {
        int[] arr={52,10,36,96,2,46,87,15};
        InsertSort006 insertSort006 = new InsertSort006();
        insertSort006.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[] arr){
        //1.判断arr是否合法
        if(arr==null){
            throw new RuntimeException("arr为空");
        }
        insertSort(arr,arr.length-1);
    }
    public void insertSort(int[] arr,int len){
        //1.判断长度是否合法
        if(len>0){
            for (int i = 0; i <= len; i++) {
                //2.设置比较的元素,和临时存储值:存储元素
                int j=i;
                int temp=arr[i];
                //3.将所有元素进行遍历指导找到比他小的元素(寻找最小元素的位置)
                while(j>0&&arr[j-1]>temp){
                    //这一步相当于自动将要比较的位置元素填充了
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=temp;
            }
        }
    }
}

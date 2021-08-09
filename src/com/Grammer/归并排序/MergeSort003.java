package com.Grammer.归并排序;

import java.util.Arrays;

//主要采用分而治之的思想
//平均时间复杂度:  O(nlogn)
public class MergeSort003 {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        MergeSort003 merge=new MergeSort003();
        merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[] arr){
        //1.判断数组的合法性
        if(arr==null){
            throw new RuntimeException("数组为空");
        }
        //2.创建哨兵数组和标记长度
        int len=arr.length;
        int[] temp=new int[len];
        //3.调用递归函数
        merSort(arr,0,len-1,temp);
    }

    private void merSort(int[] arr, int l, int r, int[] temp) {
        //1.判断大条件左边始终小于右边
        if (l<r){
            //2.分治的中间节点
            int mid=(l+r)/2;
            //3.左边的归并排序,目的:左子序列有序
            merSort(arr,l,mid,temp);
            //3.右边的归并排序,目的:右子序列有序
            merSort(arr,mid+1,r,temp);
            //4.核心:归并排序的合并
            merge(arr,l,mid,r,temp);

        }
    }

    private void merge(int[] arr, int l, int mid, int r, int[] temp) {
        //创建左右序列指针
        int i=l;
        int j=mid+1;
        //临时数组的指针
        int t=0;
        //左右序列的相对平行位置的数据进行大小的比较,谁小就放进临时数组
        while(i<=mid&&j<=r){
            //这边的额一个知识点:i++表示的是i先赋值再递增 ,自己在这想来半天
            if(arr[i]<arr[j]){
                temp[t++]=arr[i++];

            }else{
                temp[t++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[t++]=arr[i++];
        }
        while(j<=r){
            temp[t++]=arr[j++];
        }
        t=0;
        //拷贝数组
        while(l<=r){
            arr[l++]=temp[t++];
        }
    }
}




















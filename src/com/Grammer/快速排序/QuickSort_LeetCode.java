package com.Grammer.快速排序;

public class QuickSort_LeetCode {
    //第一种方式：基准取头法。
    public  void  quickSort(int[] a,int head,int tail){
        if(head>tail){
            return;
        }
        int left,right,temp;
        left=head;
        right=tail;
        temp=a[left];
        while(left<right){
            while(left<right&&a[right]>temp){
                right--;
            }
            a[right]=temp;
            while(left<right&&a[left]<temp){
                left++;
            }
            a[left]=temp;
        }
        if(left==right){
            a[left]=temp;
        }
        if(left!=head){
            quickSort(a,0,left-1);
        }
        if(right!=tail){
            quickSort(a,right+1,a.length-1);
        }
    }
    //第二种方式：基准取尾法。
    public void quickSort02(int nums[], int top, int tail) {
        if (top >= tail)
            return;
        int mid = nums[tail];
        int left = top, right = tail - 1;
        while (left < right) {
            while (nums[left] < mid && left < right) {
                left++;
            }
            while (nums[right] >= mid && left < right) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        if (nums[left] >= nums[tail]) {
            int temp = nums[left];
            nums[left] = nums[tail];
            nums[tail] = temp;
        } else {
            left++;
        }
        quickSort02(nums, top, left - 1);
        quickSort02(nums, left + 1, tail);
    }
    //第三种方式：基准取中法。
    public void quickSort03(int nums[], int top, int tail) {
        if (top >= tail)
            return;
        int left = top, right = tail, mid = nums[(top + tail) / 2];
        while (left <= right) {
            while (nums[left] < mid) {
                ++left;
            }
            while (nums[right] > mid) {
                --right;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                ++left;
                --right;
            } else if (left == right) {
                ++left;
            }
        }
        quickSort03(nums, top, right);
        quickSort03(nums, left, tail);
    }
}

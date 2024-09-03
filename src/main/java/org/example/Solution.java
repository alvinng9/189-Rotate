package org.example;

public class Solution {
    public void rotate(int[] nums, int k) {
        //if k is bigger than length of array nums, remove unnecessary work needed
        k = k % nums.length;
        //reverse the first part of the array up until k -1
        reverse(nums, 0, nums.length - k - 1);
        //reverse the second part of the array from k to the end of the array
        reverse(nums, nums.length - k, nums.length - 1);
        //reverse every index of the array
        reverse(nums, 0, nums.length - 1);
    }

    //swap values of two indexes of an array
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    //reverse values of all indexes within the start index and the end index
    public void reverse(int[] nums, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            swap(nums, left++, right--);
        }
    }
}

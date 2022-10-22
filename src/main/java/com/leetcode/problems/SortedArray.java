package com.leetcode.problems;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/

public class SortedArray {

    public static void main(String[] args) {
        System.out.println((Arrays.toString(sortedSquares(new int[] {-4, -1, 0, 3, 10}))));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] resultArray = new int[nums.length];
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[leftPointer]) >= Math.abs(nums[rightPointer])) {
                resultArray[i] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
            } else {
                resultArray[i] = nums[rightPointer] * nums[rightPointer];
                rightPointer--;
            }
        }
        return resultArray;
    }
}

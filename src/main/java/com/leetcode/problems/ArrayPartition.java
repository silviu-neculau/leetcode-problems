package com.leetcode.problems;

import java.util.Arrays;

// https://leetcode.com/problems/array-partition/description/
public class ArrayPartition {

    public static void main(String args[]) {
        System.out.println(arrayPairSum(new int[] {1, 2, 3}));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}

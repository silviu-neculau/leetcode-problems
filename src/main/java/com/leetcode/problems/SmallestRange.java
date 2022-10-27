package com.leetcode.problems;

// https://leetcode.com/problems/smallest-range-i/

public class SmallestRange {

    public static void main(String[] args) {
        System.out.println((smallestRangeI(new int[] {1, 3, 6}, 3)));
    }

    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        int range = max - min - 2 * k;

        return range > 0 ? range : 0;
    }
}

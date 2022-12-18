package com.leetcode.problems;

// https://leetcode.com/problems/find-pivot-index/description/
public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int total = 0, sum = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; sum += nums[i++]) if (sum * 2 == total - nums[i]) return i;
        return -1;
    }
}

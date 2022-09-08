package com.leetcode.problems;

// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/

public class ArrayIncreasing {
  public static void main(String[] args) {
    System.out.println(minOperations(new int[] {1, 1, 1}));
  }

  public static int minOperations(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] < nums[i + 1]) continue;
      else {
        k += nums[i] - nums[i + 1] + 1;
        nums[i + 1] = nums[i] + 1;
      }
    }
    return k;
  }
}

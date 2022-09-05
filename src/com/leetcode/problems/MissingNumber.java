package com.leetcode.problems;

// https://leetcode.com/problems/missing-number/

public class MissingNumber {

  public static void main(String[] args) {
    System.out.println((missingNumber(new int[] {1, 2, 3})));
  }

  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = (n * (n + 1)) / 2;
    for (int i = 0; i < n; i++) {
      sum = sum - nums[i];
    }

    return sum;
  }
}

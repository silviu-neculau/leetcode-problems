package com.leetcode.problems;

// https://leetcode.com/problems/monotonic-array/

public class Monotonic {
  public static void main(String[] args) {
    System.out.println((isMonotonic(new int[] {1, 2, 2, 3})));
  }

  public static boolean isMonotonic(int[] nums) {
    boolean increasing = true, decreasing = true;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] < nums[i + 1]) decreasing = false;
      if (nums[i] > nums[i + 1]) increasing = false;
    }
    if (increasing == true || decreasing == true) return true;
    return false;
  }
}

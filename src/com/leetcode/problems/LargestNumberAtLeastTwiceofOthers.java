package com.leetcode.problems;

// https://leetcode.com/problems/largest-number-at-least-twice-of-others/

public class LargestNumberAtLeastTwiceofOthers {

  public static void main(String[] args) {
    System.out.println((dominantIndex(new int[] {0, 1, 2, 3, 4})));
  }

  public static int dominantIndex(int[] nums) {
    int maxNumberIndex = -1;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (max < nums[i]) {
        max = nums[i];
        maxNumberIndex = i;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (i == maxNumberIndex) {
        continue;
      }
      if (!(nums[i] * 2 <= max)) {
        return -1;
      }
    }
    return maxNumberIndex;
  }
}

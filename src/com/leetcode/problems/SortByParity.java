package com.leetcode.problems;

// https://leetcode.com/problems/sort-array-by-parity/

public class SortByParity {
  public int[] sortArrayByParity(int[] nums) {
    int even = 0;
    int odd = 0;
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        ans[even] = nums[i];
        even++;
      } else {
        ans[nums.length - 1 - odd] = nums[i];
        odd++;
      }
    }
    return ans;
  }
}

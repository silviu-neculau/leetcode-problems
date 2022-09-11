package com.leetcode.problems;

// https://leetcode.com/problems/sort-array-by-parity/

import java.util.Arrays;

public class SortByParity {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortArrayByParity(new int[] {3, 1, 2, 4})));
  }

  public static int[] sortArrayByParity(int[] nums) {
    int even = 0;
    int odd = nums.length - 1;
    while (even < odd) {
      if (nums[even] % 2 > nums[odd] % 2) {
        int temp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = temp;
      }
      if (nums[even] % 2 == 0) even++;
      if (nums[odd] % 2 == 1) odd--;
    }
    return nums;
  }
}

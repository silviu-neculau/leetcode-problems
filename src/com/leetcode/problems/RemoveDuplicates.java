package com.leetcode.problems;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicates {
  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
  }

  public static int removeDuplicates(int[] nums) {
    int leftPointer = 0;
    for (int i = 1; i < nums.length; i++)
      if (nums[leftPointer] != nums[i]) {
        leftPointer++;
        nums[leftPointer] = nums[i];
      }
    return leftPointer + 1;
  }
}
  
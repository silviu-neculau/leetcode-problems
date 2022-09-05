package com.leetcode.problems;

public class MajorityElement {

  public static void main(String[] args) {
    System.out.println((majorityElement(new int[] {9,9,7,7,7})));
  }

  public static int majorityElement(int[] nums) {

    int n = nums.length;
    int maxcount = 0;
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }


      if (count > n / 2) {
        return nums[i];
      }
    }

    return -1;
  }
}

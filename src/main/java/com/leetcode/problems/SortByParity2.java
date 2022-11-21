package com.leetcode.problems;

// https://leetcode.com/problems/sort-array-by-parity-ii/

public class SortByParity2 {

    public static void main(String[] args) {
        System.out.println((sortArrayByParityII(new int[] {1, 2, 5, 7})));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 == 1) {
                while (nums[j] % 2 == 1) {
                    j += 2;
                }
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }
}

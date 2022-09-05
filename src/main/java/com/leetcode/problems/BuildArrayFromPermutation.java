package com.leetcode.problems;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[] {1, 2, 0})));
    }

    public static int[] buildArray(int[] nums) {
        int i = 0;
        int[] array = new int[nums.length];
        for (i = 0; i < nums.length; i++) array[i] = nums[nums[i]];
        return array;
    }
}

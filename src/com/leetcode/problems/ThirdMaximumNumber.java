package com.leetcode.problems;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println((getThirdMaxNumber(new int[] {1,2,-2147483648})));
    }

    public static int getThirdMaxNumber(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int secondtMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > firstMax) {
                thirdMax = secondtMax;
                secondtMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secondtMax && nums[i] != firstMax) {
                thirdMax = secondtMax;
                secondtMax = nums[i];
            } else if (nums[i] > thirdMax && nums[i] != secondtMax && nums[i] != firstMax)
                thirdMax = nums[i];
        }
        if (nums.length < 3) return firstMax;

        return thirdMax;

    }
}

package com.leetcode.problems;

import java.util.Arrays;
public class RunningSumOf1dArray {

    public static void main(String[] args){
        System.out.println((runningSum(new int[]{1, 2, 0})));
    }

    public static int[] runningSum(int[] nums) {
        int[] sum= new int[nums.length];
        sum[0]=nums[0];
        for(int i=1; i<nums.length; i++)
            sum[i]=sum[i-1]+nums[i];
        return sum;
    }

}


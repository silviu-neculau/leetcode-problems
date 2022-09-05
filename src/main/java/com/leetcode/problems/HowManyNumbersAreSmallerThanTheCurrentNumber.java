package com.leetcode.problems;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        System.out.println((smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[]array=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])   count++;
            }
            array[i]=count;
        }
        return array;
    }
}

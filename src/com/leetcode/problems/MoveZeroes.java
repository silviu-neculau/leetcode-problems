package com.leetcode.problems;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zerocounter = 0;

        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]!=0){
                nums[zerocounter] = nums[i];
                zerocounter++;
            }
        }
        for(int i = zerocounter; i<nums.length ;i++){
            nums[i] = 0;
        }
    }
}
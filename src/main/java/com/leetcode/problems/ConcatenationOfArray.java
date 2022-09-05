package com.leetcode.problems;

public class ConcatenationOfArray {

    public static void main(String[] args){
        System.out.println((getConcatenation(new int[]{1, 2, 0})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            array[i]=nums[i];
            array[i + nums.length] = nums[i];
        }
        return array;
    }
}

package com.leetcode.problems;

public class ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println((shuffle(new int [] {1,2,3,4},2)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int index = 0;
        for(int i = 0; i < n; i++){
            arr[index] = nums[i];
            index++;
            arr[index] = nums[n+i];
            index++;
        }
        return arr;
    }
}


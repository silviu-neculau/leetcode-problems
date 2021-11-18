package com.leetcode.problems;

//https://leetcode.com/problems/remove-element/

public class RemoveElement {

    public static void main(String[] args) {
        System.out.println((removeElement(new int[] {1,2,3}, 4)));
    }
    
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

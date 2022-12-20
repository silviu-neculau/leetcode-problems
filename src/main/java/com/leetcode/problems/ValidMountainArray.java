package com.leetcode.problems;

// https://leetcode.com/problems/valid-mountain-array/description/
public class ValidMountainArray {

    public static void main(String args[]){System.out.println(validMountainArray(new int[]{1,2,4,3,2,1}));}
    public static boolean validMountainArray(int[] array) {
        if (array.length < 3) {
            return false;
        }
        int left = 0;
        int right = array.length - 1;
        while (left + 1 < array.length - 1 && array[left] < array[left + 1]) {
            left++;
        }
        while (right - 1 > 0 && array[right] < array[right - 1]) {
            right--;
        }
        return left == right;
    }
}

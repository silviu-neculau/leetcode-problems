package com.leetcode.problems;

// https://leetcode.com/problems/counting-bits/

public class CountingBits {

    public static void main(String[] arg) {
        System.out.println(countBits(5));
    }

    public static int[] countBits(int num) {
        int result[] = new int[num + 1];
        int offset = 1;
        for (int index = 1; index < num + 1; ++index) {
            if (offset * 2 == index) {
                offset *= 2;
            }
            result[index] = result[index - offset] + 1;
        }
        return result;
    }
}
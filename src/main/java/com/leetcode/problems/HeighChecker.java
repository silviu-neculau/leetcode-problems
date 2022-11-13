package com.leetcode.problems;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/

public class HeighChecker {

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[] {1, 3, 4, 4, 6}));
    }

    public static int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int count = 0;
        for (int i = 0; i < copy.length; i++) {
            if (heights[i] != copy[i]) count++;
        }
        return count;
    }
}

package com.leetcode.problems;

// https://leetcode.com/problems/fair-candy-swap/description/

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(fairCandySwap(new int[] {1, 2}, new int[] {2, 2})));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumB += bobSizes[i];
        }
        int dif = (sumA - sumB) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == dif) {
                    return new int[] {aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return null;
    }
}

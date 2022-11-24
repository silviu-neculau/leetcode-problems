package com.leetcode.problems;

// https://leetcode.com/problems/binary-gap/

public class BinaryGap {
    public int binaryGap(int n) {
        int current = -1;
        int gap = 0;

        while (n % 2 == 0) n /= 2;

        while (n > 0) {
            if (n % 2 == 1) {
                current++;
                gap = Math.max(current, gap);
                current = 0;
            } else {
                current++;
            }
            n /= 2;
        }

        return gap;
    }
}

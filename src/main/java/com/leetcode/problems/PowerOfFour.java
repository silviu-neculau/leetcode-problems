package com.leetcode.problems;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println((isPowerOfFour(1534)));
    }

    public static boolean isPowerOfFour(int n) {
        while (n > 0) {
            if (n == 1) return true;
            if (n % 4 != 0) return false;
            else n = n / 4;
        }
        return false;
    }
}

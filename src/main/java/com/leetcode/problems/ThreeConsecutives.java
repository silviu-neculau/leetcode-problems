package com.leetcode.problems;

// https://leetcode.com/problems/three-consecutive-odds/description/
public class ThreeConsecutives {
    public static void main(String arg[]) {
        System.out.println(threeConsecutiveOdds(new int[] {0, 1, 3, 4}));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            countOdd = arr[i] % 2 == 1 ? countOdd + 1 : 0;
            if (countOdd == 3) return true;
        }
        return false;
    }
}

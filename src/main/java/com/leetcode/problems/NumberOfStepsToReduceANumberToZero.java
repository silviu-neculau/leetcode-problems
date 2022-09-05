package com.leetcode.problems;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println((numberOfSteps(123)));
    }

    public static int numberOfSteps(int num) {
        int k = 0;
        while (num != 0) k++;
        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = num - 1;
        }
        return k;
    }
}

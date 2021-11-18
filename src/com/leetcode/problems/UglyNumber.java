package com.leetcode.problems;

public class UglyNumber {

    public static void main(String[] args) {
        System.out.println((isUgly(15)));
    }


    public static boolean isUgly(int number) {
        if (number == 0)
            return false;
        if (number == 1)
            return true;

        while (number != 1) {

            if (number % 2 == 0) {
                number = number / 2;
            } else if (number % 3 == 0) {
                number = number / 3;
            } else if (number % 5 == 0) {
                number = number / 5;
            } else {
                return false;
            }

        }
        return true;
    }
}

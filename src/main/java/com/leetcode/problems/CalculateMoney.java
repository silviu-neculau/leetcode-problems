package com.leetcode.problems;

// https://leetcode.com/problems/calculate-money-in-leetcode-bank/

public class CalculateMoney {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
    }

    public static int totalMoney(int n) {
        int completWeeks = n / 7;
        int restOfDays = n % 7;
        int completeWeeksSum = (28 * completWeeks) + 7 * completWeeks * (completWeeks - 1) / 2;
        int restOfDaysSum = ((restOfDays * (restOfDays + 1)) / 2) + completWeeks * restOfDays;
        return completeWeeksSum + restOfDaysSum;
    }
}

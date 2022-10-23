package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/self-dividing-numbers/

public class SelfDividingNumbers {

    public static void main(String[] args) {
        System.out.println((selfDividingNumbers(1, 6)));
    }

    public static boolean isDivisible(int num) {
        int temp = num;
        while (num > 0) {
            int n = num % 10;
            if (n == 0 || temp % n != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            if (num < 10) {
                numbers.add(num);
            } else {
                if (isDivisible(num)) {
                    numbers.add(num);
                }
            }
        }
        return numbers;
    }
}

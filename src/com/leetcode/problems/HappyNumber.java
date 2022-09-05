package com.leetcode.problems;

// https://leetcode.com/problems/happy-number/

public class HappyNumber {
  public static void main(String[] args) {
    System.out.println(isHappy(18));
  }

  public static boolean isHappy(int n) {
    int sum = 0;
    while (n > 9) {
      while (n > 0) {
        int reminder = (n % 10);
        sum += (reminder * reminder);
        n /= 10;
      }
      n = sum;
      sum = 0;
    }
    if (n == 1 || n == 7) {
      return true;
    } else {
      return false;
    }
  }
}

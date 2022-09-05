package com.leetcode.problems;

// https://leetcode.com/problems/power-of-three/

public class PowerOfThree {

  public static void main(String[] args) {
    System.out.println((isPowerOfThree(8)));
  }

  public static boolean isPowerOfThree(int n) {
    if (n == 1) {
      return true;
    }
    while (n > 3) {
      if (n % 3 == 0) {
        n /= 3;
      } else return false;
    }
    if (n == 3) return true;
    return false;
  }
}

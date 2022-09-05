package com.leetcode.problems;

// https://leetcode.com/problems/sqrtx/

public class Sqrt {
  public static void main(String[] args) {
    System.out.println(mySqrt(2));
  }

  public static int mySqrt(int x) {
    if (x <= 1) return x;
    int start = 2, end = x / 2, mid = 0, rootNumber = 0;
    long num;
    while (start <= end) {
      mid = (start + end) / 2;
      num = (long) mid * mid;
      if (num == x) {
        rootNumber = mid;
        break;
      }
      if (num < x) {
        start = mid + 1;
        rootNumber = mid;
      } else {
        end = mid - 1;
      }
    }
    return rootNumber;
  }
}

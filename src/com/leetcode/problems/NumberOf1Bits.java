package com.leetcode.problems;

// https://leetcode.com/problems/number-of-1-bits/

public class NumberOf1Bits {
  public static void main(String[] args) {
    System.out.println(hammingWeight(10));
  }

  public static int hammingWeight(int n) {
    int count = 0;
    String str = Integer.toBinaryString(n);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }
}

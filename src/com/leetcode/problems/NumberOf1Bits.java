package com.leetcode.problems;

// https://leetcode.com/problems/number-of-1-bits/

public class NumberOf1Bits {
  public static void main(String[] args) {
    System.out.println(hammingWeight(10));
  }

  public static int hammingWeight(int n) {
    int count = 0;
    while (n!=0){
      count= count + (n & 1);
      n = n >> 1;
    }
    return count;
  }
}

package com.leetcode.problems;

public class NumberOfStepsToReduceANumberToZero {
  public static void main(String[] args) {
    System.out.println((numberOfSteps(123)));
  }

  public static int numberOfSteps(int num) {
    int k = 0;
    while (num != 0)
      if (num % 2 == 0) {
        num = num / 2;
        k++;
      } else {
        num = num - 1;
        k++;
      }
    return k;
  }
}

package com.leetcode.problems;

// https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessNumber {

  public static void main(String[] args) {
    System.out.println(guessNumber(18));
  }

  public static int guessNumber(int n) {
    int start = 0;
    int end = n;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      int result = 0; // guess(mid); // function from the site
      if (result == 0) {
        return mid;
      } else if (result == 1) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}

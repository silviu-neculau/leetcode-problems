package com.leetcode.problems;

// https://leetcode.com/problems/find-the-difference/

public class FindTheDifference {
  public static void main(String[] args) {
    System.out.println(findTheDifference("abcd", "abcde"));
  }

  public static char findTheDifference(String s, String t) {
    int i = 0;
    int sum = 0;
    for (i = 0; i < s.length(); i++) {
      sum = sum + t.charAt(i) - s.charAt(i);
    }
    sum += t.charAt(i);
    return (char) sum;
  }
}

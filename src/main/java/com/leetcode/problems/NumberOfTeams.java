package com.leetcode.problems;

public class NumberOfTeams {

  public static void main(String[] args) {
    System.out.println((numTeams(new int[] {1,2,3,4})));
  }

  public static int numTeams(int[] rating) {
    int teams = 0;
    int n = rating.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++)
          if (rating[i] < rating[j] && rating[j] < rating[k])
            teams++;
          else if (rating[i] > rating[j] && rating[j] > rating[k])
            teams++;
      }
    }
    return teams;
  }
}

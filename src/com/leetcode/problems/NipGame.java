package com.leetcode.problems;

// https://leetcode.com/problems/nim-game/

public class NipGame {
  public boolean canWinNim(int n) {
    return n % 4 == 0 ? false : true;
    /* for the base case when the number is 4, no matter which number that that first player,
     the second player would always be able to pick the remaining number.
     for numbers 5,6,7 which are bettween 4 and 8=(4*2) the first player can reduce the number
     to 4 to make the 2nd player lose and the same logic applies for bigger numbers*/
  }
}

package com.leetcode.problems;

// https://leetcode.com/problems/robot-return-to-origin/

public class ReturnOrigin {

  public static void main(String[] args) {
    System.out.println((judgeCircle("UDLR")));
  }

  public static boolean judgeCircle(String moves) {
    int v = 0;
    int h = 0;
    for (char c : moves.toCharArray()) {
      switch (c){
      case 'U':
          v++;
          break;
        case 'D':
          v--;
          break;
        case 'L':
          h++;
          break;
        case 'R':
          h--;
          break;
  }
    }
    return (v == 0 && h == 0);
  }
}

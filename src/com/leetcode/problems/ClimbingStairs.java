package com.leetcode.problems;

public class ClimbingStairs {
    public static void main(String []args){
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        int[] stairs = new int[n];
        stairs[0] = 1;
        stairs[1] = 2;
        for(int i = 2; i < n; i++){
            stairs[i]=stairs[i-2]+stairs[i-1];
        }
        return stairs[n-1];
    }
}

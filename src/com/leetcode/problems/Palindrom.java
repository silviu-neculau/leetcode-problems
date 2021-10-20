package com.leetcode.problems;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println((isPalindrome(121)));
    }
    public static boolean isPalindrome(int x) {
        int cx = x, inv = 0;
        if(x < 0)
            return false;

        while(cx != 0){
            inv = inv * 10 + cx % 10;
            cx = cx /10;
        }
        if(x == inv)
            return true;
        else
            return false;
    }
}

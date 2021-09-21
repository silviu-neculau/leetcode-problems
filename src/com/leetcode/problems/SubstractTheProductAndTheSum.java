package com.leetcode.problems;

import java.util.Arrays;

public class SubstractTheProductAndTheSum {
    public static void main(String[] args){
        System.out.println((subtractProductAndSum(13)));
    }
    public static int subtractProductAndSum(int n) {
        int sum=0, prod=1;
        while(n>0){
            sum= sum + (n%10);
            prod= prod * (n%10);
            n=n/10;
        }
        return prod-sum;
    }
}

package com.leetcode.problems;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        System.out.println((diagonalSum(new int[][] {{1,2,3},{4,5,6}})));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0 ; i < n; i++){
            sum = sum + mat[i][i] + mat[i][n-i-1];
        }
        if(n % 2 != 0){
            sum = sum - mat[n/2][n/2];
        }
        return sum;
    }
}

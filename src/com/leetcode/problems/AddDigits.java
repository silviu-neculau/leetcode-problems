package com.leetcode.problems;

public class AddDigits {

    public static void main(String []args){
        System.out.println(addDigits(3));
    }
    public static int addDigits(int num) {
        int total = 0;

        while (num > 0) {
            total += num % 10;
            num = num / 10;

            if (num == 0 && total >= 10) {
                num = total;
                total = 0;
            }
        }

        return total;
    }

}

package com.leetcode.problems;

// https://leetcode.com/problems/add-binary/

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("3", "2"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int rest = 0;
        while (i >= 0 || j >= 0) {
            int sum = rest;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            rest = sum > 1 ? 1 : 0;
            result.append(sum % 2);
        }
        if (rest != 0) {
            result.append(rest);
        }
        return result.reverse().toString();
    }
}

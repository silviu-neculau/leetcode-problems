package com.leetcode.problems;

// https://leetcode.com/problems/defanging-an-ip-address/

public class DefangingAddress {

    public static void main(String[] args) {
        System.out.println((defangIPaddr("2.3.1")));
    }

    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                str.append("[.]");
            } else {
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
}

package com.leetcode.problems;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class EquivalentStrings {

    public static void main(String[] args) {
        System.out.println(
                arrayStringsAreEqual(new String[] {"a", "bc"}, new String[] {"a", "bc"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }

        for (String word : word2) {
            sb2.append(word);
        }

        return sb1.toString().equals(sb2.toString());
    }
}

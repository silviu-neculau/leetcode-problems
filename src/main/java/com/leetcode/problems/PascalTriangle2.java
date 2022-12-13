package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle-ii/description/

public class PascalTriangle2 {

    public static void main(String args[]) {
        System.out.println(getRow(5));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            array.add(1);
            for (int j = i - 1; j > 0; j--) {
                array.set(j, array.get(j - 1) + array.get(j));
            }
        }
        return array;
    }
}

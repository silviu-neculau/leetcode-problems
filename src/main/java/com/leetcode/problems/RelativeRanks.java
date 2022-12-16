package com.leetcode.problems;

import java.util.Arrays;

// https://leetcode.com/problems/relative-ranks/description/
public class RelativeRanks {
    public static void main(String args[]) {
        System.out.println(findRelativeRanks(new int[] {1, 2, 3, 4}));
    }

    public static String[] findRelativeRanks(int[] nums) {
        int[][] pair = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        Arrays.sort(pair, (a, b) -> (b[0] - a[0]));

        String[] array = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                array[pair[i][1]] = "Gold Medal";
            } else if (i == 1) {
                array[pair[i][1]] = "Silver Medal";
            } else if (i == 2) {
                array[pair[i][1]] = "Bronze Medal";
            } else {
                array[pair[i][1]] = (i + 1) + "";
            }
        }

        return array;
    }
}

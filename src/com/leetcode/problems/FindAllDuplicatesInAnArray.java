package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) duplicates.add(index + 1);
            nums[index] = -nums[index];
        }
        return duplicates;
    }
}

// https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
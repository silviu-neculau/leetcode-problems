package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-i/description/
public class NextGreaterElement {

    public static void main(String args[]) {
        System.out.println(nextGreaterElement(new int[] {1, 2, 3}, new int[] {3, 4, 5}));
    }

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num) map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++) findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
package com.leetcode.problems;

public class HighestAltitude {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[] {-4, -3, -2, -1, 4, 3, 2}));
    }

    public static int largestAltitude(int[] gain) {
        int currentPoint = 0, highestAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentPoint += gain[i];
            if (highestAltitude < currentPoint) highestAltitude = currentPoint;
        }
        return highestAltitude;
    }
}

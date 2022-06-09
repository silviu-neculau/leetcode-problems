package com.leetcode.problems;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakMountain {
  public static void main(String[] args) {
    System.out.println((peakIndexInMountainArray(new int[] {1, 2, 0})));
  }

  public static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }

    return start;
  }
}

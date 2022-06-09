package com.leetcode.problems;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class StockProfit {
  public static void main(String[] args) {
    System.out.println((maxProfit(new int[] {7, 6, 4, 3, 1})));
  }

  public static int maxProfit(int[] prices) {
    int profitToday = 0, mediumProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
      profitToday = prices[i] - minPrice;
      if (mediumProfit < profitToday) mediumProfit = profitToday;
    }
    return mediumProfit;
  }
}

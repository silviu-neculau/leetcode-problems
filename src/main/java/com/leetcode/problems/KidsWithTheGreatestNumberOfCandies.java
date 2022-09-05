package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> theMostCandies = new ArrayList<>();
        int temp = 0, max = 0;
        for (int i = 0; i < candies.length; i++) if (max < candies[i]) max = candies[i];
        for (int j = 0; j < candies.length; j++) {
            temp = candies[j] + extraCandies;
            if (temp >= max) theMostCandies.add(true);
            else theMostCandies.add(false);

            temp = 0;
        }
        return theMostCandies;
    }
}

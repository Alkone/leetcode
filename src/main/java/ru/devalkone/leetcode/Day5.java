package ru.devalkone.leetcode;

import java.util.HashMap;

public class Day5 {

    public static int maxProfit(int[] prices) {
        var min = Integer.MAX_VALUE;
        var profit = 0;

        for (var price : prices) {
            if (price <= min) {
                min = price;
            } else {
                var currentProfit = price - min;
                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            }
        }

        return profit;
    }

    public static int longestPalindrome(String s) {
        var counter = new HashMap<Character, Integer>();
        for (var ch : s.toCharArray()) {
            var chCount = counter.getOrDefault(ch, 0);
            counter.put(ch, ++chCount);
        }

        var evens = 0;
        var odds = 0;
        var hasOdds = false;
        for (var chCount : counter.values()) {
            if (chCount % 2 == 0) evens += chCount;
            else {
                hasOdds = true;
                odds += chCount - 1;
            }
        }

        return evens + odds + (hasOdds ? 1 : 0);
    }

}

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// Find the maximum profit you can achieve. You may complete at most two transactions.

// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

// Example 1:
// Input: prices = [3,3,5,0,0,3,1,4]
// Output: 6
// Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
// Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.

class Solution {
    public int maxProfit(int[] prices) {
        int buy1=Integer.MAX_VALUE;
        int sell1=0;
        int buy2=Integer.MAX_VALUE;
        int sell2=0;
        for(int price:prices){
            buy1=Math.min(buy1,price);
            sell1=Math.max(sell1,price-buy1);
            buy2=Math.min(buy2,price-sell1);
            sell2=Math.max(sell2,price-buy2);
        }
        return sell2;
    }
}

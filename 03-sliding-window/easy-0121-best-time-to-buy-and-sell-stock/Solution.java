class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int p: prices){
            if (p < min) { min = p; }
            int newProfit = p - min;
            if (newProfit > profit) {
                profit = newProfit;
            }
        }
        return profit;
    }
}
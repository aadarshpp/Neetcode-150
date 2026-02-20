class Solution {
    public int maxmaxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];

        for (int p: prices){

            if (p < min) { 
                min = p; 
            }

            int newmaxProfit = p - min;
            if (newmaxProfit > maxProfit) {
                maxProfit = newmaxProfit;
            }
        }

        return maxProfit;
    }
}
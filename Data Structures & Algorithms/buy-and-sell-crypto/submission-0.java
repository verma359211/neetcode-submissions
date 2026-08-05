class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for(int i = 1; i< prices.length;i++){
            int high = prices[i];
            int newProfit = high - min;
            profit = Math.max(profit,newProfit);
            min = Math.min(min,high);
        }
        return profit;
    }
}

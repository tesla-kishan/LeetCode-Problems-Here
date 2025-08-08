class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit =0;
        int buy = prices[0];
        for(int i=0 ; i<n ; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                int curr_profit = prices[i]-buy;
                profit=Math.max(curr_profit,profit);
            }
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int ans=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(prices[i],min);
            int profit=prices[i]-min;
            ans=Math.max(ans, profit);
        }
        return ans;
    }
}
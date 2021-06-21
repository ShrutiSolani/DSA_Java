class BestTimeForStock {
    public int maxProfit(int[] prices) {
        int start = 0;
        int i;
        int dp[] = new int[prices.length];
        dp[0] = 0;
        for(i = 1;i < prices.length; i++){
            dp[i] = Math.max(dp[i-1], prices[i] - prices[start]);
            // System.out.println(dp[i]);
            if( prices[i] < prices[start]){
                start = i;
            }
        }
        return dp[dp.length - 1];
    }
}
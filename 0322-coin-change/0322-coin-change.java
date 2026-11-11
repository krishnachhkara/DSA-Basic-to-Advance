class Solution {
    public int f(int[]coins,int amount,int[] dp){
        if(amount == 0){
            return 0;
        }

        if(amount < 0){
            return Integer.MAX_VALUE/2;
        }

        if(dp[amount] != -1){
            return dp[amount];
        }

        int mincoins = Integer.MAX_VALUE/2;

        for(int coin : coins){
            int result = f(coins,amount-coin,dp);

            mincoins = Math.min(mincoins,1+result);
        }

        dp[amount] = mincoins;
        return dp[amount];
   
    }


    public int coinChange(int[] coins, int amount) {

        //recursion + memoization

        int[] dp = new int[amount + 1];
        Arrays.fill(dp,-1);

        int ans = f(coins,amount,dp);

        return ans >= Integer.MAX_VALUE / 2 ? -1 : ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
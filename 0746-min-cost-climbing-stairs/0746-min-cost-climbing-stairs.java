class Solution {
    // public int solve(int idx, int[] cost, int[] dp){
    //     if(idx == 0 || idx == 1){
    //         return 0;
    //     }

    //     if(dp[idx] != - 1){
    //         return dp[idx];
    //     }

    //     int fs = solve(idx-1,cost,dp) + cost[idx-1];
    //     int ss = Integer.MAX_VALUE;
    //     if(idx > 1){
    //         ss = solve(idx-2,cost,dp) + cost[idx-2];
    //     }

    //     dp[idx] = Math.min(fs,ss);
    //     return dp[idx];


    // }
    // public int minCostClimbingStairs(int[] cost) {

    //     // recursion + memorization
    //     int n = cost.length;
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp,-1);

    //     return solve(n,cost,dp);

    // }

    // tabulation method
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;
        int fs = 0;
        int ss = Integer.MAX_VALUE;


        for(int i = 2; i <= n; i++){
            fs = dp[i-1] + cost[i-1];
            if(i>1){
                ss = dp[i-2] + cost[i-2];
            }
            dp[i] = Math.min(fs,ss);
            
        }

        return dp[n];
    

    

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int solve(int idx, int[] cost, int[] dp){
        if(idx == 0 || idx == 1){
            return 0;
        }

        if(dp[idx] != - 1){
            return dp[idx];
        }

        int fs = solve(idx-1,cost,dp) + cost[idx-1];
        int ss = Integer.MAX_VALUE;
        if(idx > 1){
            ss = solve(idx-2,cost,dp) + cost[idx-2];
        }

        dp[idx] = Math.min(fs,ss);
        return dp[idx];


    }
    public int minCostClimbingStairs(int[] cost) {

        // recursion + memorization
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);

        return solve(n,cost,dp);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
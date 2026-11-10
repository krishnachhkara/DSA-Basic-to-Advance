class Solution {
    // public int solve(int n,int[] dp){

    //     if( n <= 1){
    //         dp[n] = 1;
    //     }
    //     if(dp[n] != -1){
    //         return dp[n];
    //     }

    //     dp[n] = solve(n-1,dp) + solve(n-2,dp);

    //     return dp[n];
    // }
    // public int climbStairs(int n) {
    //     int[] dp = new int[n+1];
    //     Arrays.fill(dp,-1);

    //     int result = solve(n,dp);
    //     return result;
        
    // }


    //tabulation method

    // public int climbStairs(int n){
    //     int[] dp = new int[n+1];
    //     dp[0] = 1;// zero stair par khade rahne ke liye 1 hi way hai kuch mat karo
    //     dp[1] = 1;
        
    //     for(int i = 2; i <= n; i++ ){
    //         dp[i] = dp[i-1] + dp[i-2];

    //     }

    //     return dp[n];
    // }

    //tabulation with space optimization
    public int climbStairs(int n){
        // int[] dp = new int[n+1];
        // dp[0] = 1;// zero stair par khade rahne ke liye 1 hi way hai kuch mat karo
        // dp[1] = 1;

        int prev = 1;
        int prev2 = 1;
        int curi;
        
        for(int i = 2; i <= n; i++ ){
            curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }

        return prev;// returning prev because last value is stored inside prev
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
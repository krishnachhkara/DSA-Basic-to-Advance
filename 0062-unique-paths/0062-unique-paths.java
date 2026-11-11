class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        return solve(m-1,n-1,dp);
        
    }

    private int solve(int i,int j,int[][]dp){
        if(i<0 || j<0){
            return 0;
        }

        if(i == 0 && j== 0){
            return 1;// first cell and to reach 0,0 we need 1 step i.e do nothing
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = solve(i-1,j,dp);
        int left = solve(i,j-1,dp);

        dp[i][j] = up + left;

        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
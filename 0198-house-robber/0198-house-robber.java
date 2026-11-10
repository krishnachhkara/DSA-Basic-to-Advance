class Solution {
    public int f(int idx, int[]dp,int[]nums){
        if(idx == 0){
            return nums[idx];
        }
        if(idx < 0){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        } 

        int rob = nums[idx] + f(idx - 2,dp,nums);    
        int norob = f(idx-1,dp,nums);// no money so no nums[idx] is added    
        

        dp[idx] = Math.max(rob,norob);
        return dp[idx];
        
        
        
    }
    public int rob(int[] nums) {
        // recursion and memorization
        int n = nums.length;

        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);

        return f(n-1,dp,nums);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
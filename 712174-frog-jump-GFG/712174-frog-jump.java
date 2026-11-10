// class Solution {
     
    // int cost(int idx, int[] height,int[]dp){
    //     if(idx == 0){
    //         return 0;
    //     }
    //     //calculate if not already
    //     if(dp[idx] != -1){
    //         return dp[idx];
    //     }
        
        
    //     int fs = cost(idx-1,height,dp) + Math.abs(height[idx] - height[idx-1]);   
    //     int ss = Integer.MAX_VALUE;
    //     if(idx > 1){
    //         ss = cost(idx-2,height,dp) + Math.abs(height[idx] - height[idx-2]);
    //     }
        
    //     return dp[idx] = Math.min(fs,ss);
        
    // }
    
    
    // int minCost(int[] height) {
    //     // code here
    //     // recursion with memorization
    //     int n = height.length;
    //     int[] dp = new int[n];
    //     Arrays.fill(dp,-1);
        
        
        
    //     return cost(n-1,height,dp);
        
    // }
    
    class Solution {

        int minCost(int[] height) {
            // code here
            // tabulation with space optimization
            int n = height.length;
            int[] dp = new int[n+1];
            
            dp[0] = 0;
            
            int fs = 0;
            int ss = Integer.MAX_VALUE;
            
            for(int i = 1; i < n; i++ ){
                fs = dp[i-1] + Math.abs(height[i] - height[i-1]);
                if(i>1){
                    ss = dp[i-2] + Math.abs(height[i] - height[i-2]);
            
                }
                dp[i] = Math.min(fs,ss);
            }
            return dp[n-1];

        }
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
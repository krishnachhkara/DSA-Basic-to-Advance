class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        
        int windowsum = 0;
        
        //calculating first window sum
        for(int i = 0; i < k; i++){
            windowsum += arr[i];
        }
        
        //now sliding the window
        int maxSum = windowsum;
        
        for(int i = k; i< arr.length;i++){
            windowsum = windowsum - arr[i-k] + arr[i];
            
            maxSum = Math.max(maxSum,windowsum);
            
        }
        
        
        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
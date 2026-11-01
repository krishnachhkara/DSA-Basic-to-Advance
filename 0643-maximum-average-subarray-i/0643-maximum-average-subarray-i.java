class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // return max double 
        double maxavg = 0;
        double sum = 0;

        // first window 
        for(int i = 0; i< k; i++){
                sum += nums[i];
        }

        // check condition
        maxavg = sum / k;

        // now moving the window

        for(int i = k; i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            double newavg = sum / k;
            maxavg = Math.max(newavg,maxavg);
        }

        return maxavg;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
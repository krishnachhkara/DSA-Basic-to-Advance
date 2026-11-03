class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int left = 0;
        // int sum = 0;
        // int minLen = Integer.MAX_VALUE;

        // for(int right = 0; right<nums.length; right++){
            
        //     sum += nums[right];
                                 
        //     while(sum>=target){
        //         minLen = Math.min(minLen,right - left + 1);
        //         sum -= nums[left];
        //         left++;
        //     }
           
        // }

        // return minLen==Integer.MAX_VALUE?0:minLen;
        

        // attempt 2 

        int left = 0;
        int minlen = Integer.MAX_VALUE;

        int sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            // removing extra element if condition met
            // using while loop to shrink the window until condition not met.
            while(sum >= target){
                minlen = Math.min(minlen,right -left + 1);
                sum -= nums[left];
                left++;
            }    
           
        }

        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
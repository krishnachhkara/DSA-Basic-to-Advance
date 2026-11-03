class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int count = 0;

        if(k <= 1){
            return 0;
        }

        int prod = 1;

        // sliding window start
        for(int right = 0; right < nums.length; right++){
            // product find out 
            prod = prod * nums[right];

            while(prod >= k){
                prod /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
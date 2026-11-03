class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
    
        int count = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 1){
                count++;
                
            }

            else if(nums[right] == 0){
                count = 0;
            }

            maxcount = Math.max(count,maxcount);

        }

        return maxcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;

        for(int i = 0; i < nums.length; i++){
            if(i>maxIdx){
                return false;
            }
            maxIdx = Math.max(maxIdx,i + nums[i]);
        }

        return true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
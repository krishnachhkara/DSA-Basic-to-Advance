class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!= nums[k]){
                nums[k+1] = nums[i];
                k++;
            }
        }
        return k+1;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
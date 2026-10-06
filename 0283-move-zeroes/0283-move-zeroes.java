class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        

        for(int k = 0; k < nums.length; k++){
            if(nums[k]!= 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
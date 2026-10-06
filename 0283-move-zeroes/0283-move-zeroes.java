class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while(j<nums.length){
            if(nums[i] == 0 && nums[j] == 0){
                j = j + 1;
            }
            else if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i = i + 1;
            }
            else{
                i++;
                j++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
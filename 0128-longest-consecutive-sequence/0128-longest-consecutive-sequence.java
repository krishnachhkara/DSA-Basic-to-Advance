class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int currentCount = 1;
        int maxCount = 1;

        if(nums.length ==  0){
            return maxCount = 0;
        }

        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            else if(nums[i] == nums[i-1] + 1){
                currentCount++;
            }

            else{
                maxCount = Math.max(currentCount,maxCount);
                currentCount = 1;
            }
        }
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxlen = 0;
        int zeros = 0;

        for(int right = 0; right < nums.length; right++){
            // task find len, zero count

            // if right is zero increase zero count
            if(nums[right] == 0){
                zeros++;
            }

            // check zeros should be less than k as per condition
            if(zeros <= k){
                int length = right - left + 1;
                maxlen = maxlen > length ? maxlen : length;
            }

            //remove only extra zeros not ones.
            while(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
        }

        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
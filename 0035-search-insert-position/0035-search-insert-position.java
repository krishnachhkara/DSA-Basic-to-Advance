class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            int mid = left + ( right - left )/2;

            if(target>nums[mid]){
                left = mid + 1;
            }

            else if(target<nums[mid]){
                right = mid - 1;
            }

            else{
                return mid;
            }
        }

        return left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
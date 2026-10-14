class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;

        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum == target ){
                return new int[]{
                    i+1,j+1
                };
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }

        return new int[]{
            -1,-1
        };
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
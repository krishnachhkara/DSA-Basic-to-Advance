class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int cnt = 0;

        for(int i = 0; i<nums.length;i++){
            if(cnt == 0){
                cnt = 1;
                el = nums[i];
            }
            else if( el == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        int count = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] == el){
                count++;
            }
        }

        if(count > (nums.length/2)){
            return el;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
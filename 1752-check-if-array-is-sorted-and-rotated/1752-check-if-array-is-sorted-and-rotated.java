class Solution {
    public boolean check(int[] nums) {
        int drop = 0; 
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                drop = drop +1;
            }
        }
        if(drop<=1){
            return true;
        }
        else{
            return false;
        }
    }
}
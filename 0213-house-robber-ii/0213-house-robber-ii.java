class Solution {
    public int f(int idx, int[] nums, int[]dp){
        if(idx == 0){
            return nums[0];
        }
        if(idx<0){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
       

        int fs = nums[idx] + f(idx-2,nums,dp);
        int ss = f(idx - 1,nums,dp);

        return dp[idx] = Math.max(fs,ss);

    }

    // function to exclude 1st and last index based on conditional input provided
    public int roblinear(int[]nums, int start, int end){

        int n = end - start + 1; // because 0 based indexing;

        if(n == 1){
            return nums[start];
        }

        int[] arr = new int[n];

        for(int i = 0; i< n ; i++){
            arr[i] = nums[start + i];
        }

        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        return f(n-1,arr,dp);


    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }

        //case one excluding last index
        int case1 = roblinear(nums,0,n-2);// n-1 is the last element

        //excluding 1st index or house
        int case2 = roblinear(nums,1,n-1);

        return Math.max(case1,case2); 
        
    }
}


// class Solution {

//     public int solve(int idx, int[] nums, int[] dp) {

//         if (idx == 0) {
//             return nums[0];
//         }

//         if (idx < 0) {
//             return 0;
//         }

//         if (dp[idx] != -1) {
//             return dp[idx];
//         }

//         int rob = nums[idx] + solve(idx - 2, nums, dp);

//         int norob = solve(idx - 1, nums, dp);

//         return dp[idx] = Math.max(rob, norob);
//     }

//     public int robLinear(int[] nums, int start, int end) {

//         int n = end - start + 1;

//         if (n == 1) {
//             return nums[start];
//         }

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = nums[start + i];
//         }

//         int[] dp = new int[n];

//         Arrays.fill(dp, -1);

//         return solve(n - 1, arr, dp);
//     }

//     public int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1) {
//             return nums[0];
//         }

//         // Case 1: Exclude last house
//         int case1 = robLinear(nums, 0, n - 2);

//         // Case 2: Exclude first house
//         int case2 = robLinear(nums, 1, n - 1);

//         return Math.max(case1, case2);
//     }
// }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
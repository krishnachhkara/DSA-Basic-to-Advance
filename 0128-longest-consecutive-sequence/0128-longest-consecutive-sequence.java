class Solution {
    public int longestConsecutive(int[] nums) {
        
        int length = 0;
        int maxLen = 0;

        Set<Integer> set = new HashSet<>();
        for(int a: nums){
            set.add(a);
        }

        for(int elem:set){

            if(set.contains(elem-1)){
                continue;
            }
            else{
                length += 1;
                while(set.contains(elem+1)){
                    elem++;
                    length++;
                }
                maxLen = Math.max(maxLen,length);
                length = 0;
            }

        }

        return maxLen;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // own brute force sol
        // Arrays.sort(nums);
        // int currentCount = 1;
        // int maxCount = 1;

        // if(nums.length ==  0){
        //     return maxCount = 0;
        // }

        // for(int i = 1 ; i<nums.length ; i++){
        //     if(nums[i] == nums[i-1]){
        //         continue;
        //     }

        //     else if(nums[i] == nums[i-1] + 1){
        //         currentCount++;
        //     }

        //     else{
        //         maxCount = Math.max(currentCount,maxCount);
        //         currentCount = 1;
        //     }
        // }
        // maxCount = Math.max(maxCount, currentCount);

        // return maxCount;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
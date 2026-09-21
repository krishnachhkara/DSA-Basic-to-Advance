class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){

            int lookingFor = target - nums[i];

            if(map.containsKey(lookingFor)){
                return new int[]{
                    i,
                    map.get(lookingFor)
                };
            }

            map.put(nums[i],i);
            
        }

        return new int[]{
            -1,-1
        };
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
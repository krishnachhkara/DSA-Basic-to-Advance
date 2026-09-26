class Solution {
    public int maxArea(int[] height) {
        int maximumArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left<right){
            int width = right - left;

            int area = width * Math.min(height[left],height[right]);

            maximumArea = Math.max(maximumArea, area);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maximumArea;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
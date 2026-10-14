class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxarea = 0;

        while(i<j){
            int left = height[i];
            int right = height[j];

            if(left<right){
                i++;
            }
            else if( right< left){
                j--;
            }
            else{
                j--;
            }
            int width = j - i + 1;
            int area = width * (Math.min(left,right));
            maxarea = Math.max(maxarea,area);
        }
        return maxarea;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
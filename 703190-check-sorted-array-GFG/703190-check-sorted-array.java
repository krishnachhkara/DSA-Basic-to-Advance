class Solution {
    public boolean isSorted(int[] arr) {
        
        for(int i = 1; i< arr.length; i++){
            
            if(arr[i] >= arr[i-1]){
                
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
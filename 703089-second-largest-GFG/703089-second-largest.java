class Solution {
    public int getSecondLargest(int[] arr) {
        int slargest = -1;
        int largest = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            
            if(arr[i]> largest){
                slargest = largest;
                largest = arr[i];
            }
            if(arr[i]>slargest && arr[i]< largest){
                slargest = arr[i];
                
            }
        }
        return slargest;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
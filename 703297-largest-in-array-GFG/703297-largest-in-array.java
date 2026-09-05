class Solution {
    public static int largest(int[] arr) {
        int largest = arr[0];
        
        for(int i =1; i < arr.length;i++){
            
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
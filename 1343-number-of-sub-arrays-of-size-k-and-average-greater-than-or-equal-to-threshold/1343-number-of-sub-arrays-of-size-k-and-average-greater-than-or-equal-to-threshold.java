class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double avg = 0;
        int sum = 0;
        int count = 0;

        // first window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        //first avg
        avg = sum / k;

        if(avg >= threshold){
            count++;
        }

        //now slide the window
        for(int i = k; i< arr.length;i++){
            sum = sum - arr[i-k] + arr[i];
            avg = sum / k;

            //checking condition
            if(avg >= threshold){
                count++;
            }

        }
        return count;        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
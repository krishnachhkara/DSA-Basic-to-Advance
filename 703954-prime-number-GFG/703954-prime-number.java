class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n == 1){
            return false;
        }
        
        int count = 1;
        
        for(int i = 2; i*1<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        
        if(count == 2){
            return true;
        }
        
        return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
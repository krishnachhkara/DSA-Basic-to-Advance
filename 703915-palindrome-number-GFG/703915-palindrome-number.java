class Solution {
    public boolean isPalindrome(int n) {
        int m = Math.abs(n);
        int reverse = 0;
        while(m > 0){
            int digit = m % 10;
            reverse = 10 * reverse + digit;
            m = m /10;
            
        }
        
        if ( reverse == Math.abs(n)){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public static int gcd(int a, int b) {
        
        while(a>0 && b>0){
            
            if(a>b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        
        if(a == 0){
            return b;
        }
        return a;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
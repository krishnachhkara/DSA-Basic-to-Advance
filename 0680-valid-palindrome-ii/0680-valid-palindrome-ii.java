class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s,left+1,right)|| isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
           if(s.charAt(left) != s.charAt(right)){
            return false;

           }

           left++;
           right--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
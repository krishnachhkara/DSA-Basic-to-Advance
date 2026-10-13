class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        // for empty and one element check
        if(s.length() == 1){
            return true;
        }

        while(i < j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i = i + 1;
            }
            while(i<j &&!Character.isLetterOrDigit(s.charAt(j))){
                j = j - 1;
            }
            if((Character.toLowerCase(s.charAt(i))) != (Character.toLowerCase(s.charAt(j)))){
               return false;
            }
            i++;
            j--;
            
        }

        return true;
        
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
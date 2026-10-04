class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j = j + 1;
            }
            i = i + 1;
        }

        return t.length() - j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
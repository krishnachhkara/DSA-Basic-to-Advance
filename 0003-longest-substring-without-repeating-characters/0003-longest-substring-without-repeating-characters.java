class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> set = new HashSet<>();

        // int left = 0;
        // int length = 0;
        // int maxLen = 0;

        // for(int right = 0; right < s.length(); right++){
        //     while(set.contains(s.charAt(right))){
        //         set.remove(s.charAt(left));
        //         left++;
               
        //     }

        //     set.add(s.charAt(right));

        //     length = right - left + 1;            
            
        //     maxLen = Math.max(maxLen,length);
        // }

        // return maxLen;

        HashSet<Character> set = new HashSet<>();

        int i = 0;// left end
        // int j = 0; right end

        int maxlen = 0;

        //fill the set
        for(int j = 0; j < s.length(); j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j));

            int length = j - i + 1;

            maxlen = Math.max(length,maxlen);

        }

        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
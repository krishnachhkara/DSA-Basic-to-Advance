class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxlen = 0;
        int maxfreq = 0;

        int[] arr = new int[26];

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            int index = ch - 'A';
            arr[index]++;

            // max freq
            maxfreq = maxfreq>arr[index]?maxfreq:arr[index];
            // maxfreq = Math.max(maxfreq,arr[index]);

            //window invalid check
            // int len = right - left + 1;
            //replacement = len - max freq . to know how many letters we can replace.
            while(((right - left + 1)- maxfreq )> k){
                int leftindex = s.charAt(left) - 'A';

                arr[leftindex]--;
                left++;
            }

            //updating max length
            maxlen = maxlen > (right - left + 1) ? maxlen:(right - left + 1);
        }

        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
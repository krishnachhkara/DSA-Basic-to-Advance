import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()){
            return "";
        }

        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        // Step 1: Build frequency map of t
        for(int i = 0; i < t.length(); i++){

            char ch = t.charAt(i);

            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int required = tMap.size();
        int formed = 0;

        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        // Step 2: Expand window
        for(int right = 0; right < s.length(); right++){

            char current = s.charAt(right);

            // Only track characters that exist in t
            if(tMap.containsKey(current)){

                int count = windowMap.getOrDefault(current, 0) + 1;

                windowMap.put(current, count);

                // Character frequency is now satisfied
                if(count == tMap.get(current)){
                    formed++;
                }
            }

            // Step 3: Shrink while window is valid
            while(formed == required){

                // Calculate current window length
                int len = right - left + 1;

                // Update minimum window
                if(len < minLen){

                    minLen = len;
                    startIndex = left;
                }

                // Outgoing character
                char outgoing = s.charAt(left);

                if(tMap.containsKey(outgoing)){

                    int count = windowMap.get(outgoing);

                    // Removing this character will make it invalid
                    if(count == tMap.get(outgoing)){
                        formed--;
                    }

                    if(count == 1){
                        windowMap.remove(outgoing);
                    }
                    else{
                        windowMap.put(outgoing, count - 1);
                    }
                }

                left++;
            }
        }

        // Step 4: Return answer
        if(minLen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
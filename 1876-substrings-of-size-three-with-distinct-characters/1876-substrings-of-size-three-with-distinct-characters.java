class Solution {
    public int countGoodSubstrings(String s) {

        int k = 3;
        int count = 0;

       Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            // Step 1: Add current character
            char current = (s.charAt(i));

            map.put(current,map.getOrDefault(current,0)+1);

            // Step 2: Remove outgoing character
            if (i >= k) {
                char outgoing = (s.charAt(i - k));

                //updating map value by reducing frequency
                map.put(outgoing,map.get(outgoing)-1);

                //removing condition
                if(map.get(outgoing) == 0){
                    map.remove(outgoing);
                }
            }

            // Step 3: Process complete window
            if (i >= k - 1) {
                if (map.size() == k) {
                    count++;
                }
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
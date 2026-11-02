class Solution {
    public int maxVowels(String s, int k) {
        //since substring we use hashmap.

        int count = 0;
        int maxcount = 0;

        Map<Character,Integer > map = new HashMap<>();

        // window creation and movement with condition

        for(int i = 0; i < s.length();i++){
            char current = s.charAt(i);

            map.put(current, map.getOrDefault(current,0)+1);
            //checking size does not exceed k
            if(i >= k){
                char outgoing = s.charAt(i-k);

                map.put(outgoing, map.get(outgoing)-1);

                if(map.get(outgoing) == 0){
                    map.remove(outgoing);
                }

                if(outgoing == 'a' || outgoing == 'e' || outgoing == 'i' || outgoing == 'o' || outgoing == 'u' )
                {
                    count--;
                }
            }

            // now given vowel condition

            if(current == 'a' || current == 'e' || current == 'i' || 
            current == 'o' || current == 'u' )
            {
                count++;
            }
            // updating max count only for k size window
            if(i >= k-1){
                maxcount = Math.max(maxcount,count);
            }
        }

        return maxcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
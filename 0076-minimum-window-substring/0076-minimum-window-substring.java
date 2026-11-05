import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {

        // if(s.length() < t.length()){
        //     return "";
        // }

        // HashMap<Character, Integer> tMap = new HashMap<>();
        // HashMap<Character, Integer> windowMap = new HashMap<>();

        // // Step 1: Build frequency map of t
        // for(int i = 0; i < t.length(); i++){

        //     char ch = t.charAt(i);

        //     tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        // }

        // int required = tMap.size();
        // int formed = 0;

        // int left = 0;

        // int minLen = Integer.MAX_VALUE;
        // int startIndex = 0;

        // // Step 2: Expand window
        // for(int right = 0; right < s.length(); right++){

        //     char current = s.charAt(right);

        //     // Only track characters that exist in t
        //     if(tMap.containsKey(current)){

        //         int count = windowMap.getOrDefault(current, 0) + 1;

        //         windowMap.put(current, count);

        //         // Character frequency is now satisfied
        //         if(count == tMap.get(current)){
        //             formed++;
        //         }
        //     }

        //     // Step 3: Shrink while window is valid
        //     while(formed == required){

        //         // Calculate current window length
        //         int len = right - left + 1;

        //         // Update minimum window
        //         if(len < minLen){

        //             minLen = len;
        //             startIndex = left;
        //         }

        //         // Outgoing character
        //         char outgoing = s.charAt(left);

        //         if(tMap.containsKey(outgoing)){

        //             int count = windowMap.get(outgoing);

        //             // Removing this character will make it invalid
        //             if(count == tMap.get(outgoing)){
        //                 formed--;
        //             }

        //             if(count == 1){
        //                 windowMap.remove(outgoing);
        //             }
        //             else{
        //                 windowMap.put(outgoing, count - 1);
        //             }
        //         }

        //         left++;
        //     }
        // }

        // // Step 4: Return answer
        // if(minLen == Integer.MAX_VALUE){
        //     return "";
        // }

        // return s.substring(startIndex, startIndex + minLen);


        //atempt 2

        if(s.length()<t.length()){
            return "";
        }

        int slen = s.length();
        int tlen = t.length();

        int left = 0;
        int minlen = Integer.MAX_VALUE;
        
        //filling tmap

        HashMap<Character,Integer> tmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();

        for(int i = 0; i<tlen; i++){
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }

        int required = tmap.size();
        int formed = 0;
        int startIndex = 0;

        //filling smap 
        for(int right = 0; right < slen; right++){
            //

            char current = s.charAt(right);


            if(tmap.containsKey(current)){

                int count = smap.getOrDefault(current,0)+1;

                smap.put(current,count);

                if(count == tmap.get(current)){
                    formed++;
                }
            }
           
            //shrinking
            while(formed == required){
                //calculate len
                int len = right - left + 1;

                if(len < minlen){
                    minlen = len;
                    startIndex = left;
                }

                // shrink

                char outgoing = s.charAt(left);

                if(tmap.containsKey(outgoing)){
                    int count = smap.get(outgoing);

                    if(count == 1){
                        smap.remove(outgoing);
                    }
                    else{
                        smap.put(outgoing,smap.get(outgoing)-1);
                    }

                    if(count == tmap.get(outgoing)){
                        formed--;
                    }
                }
                left++;
            }

        }
        return minlen == Integer.MAX_VALUE?"":s.substring(startIndex,startIndex+minlen);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
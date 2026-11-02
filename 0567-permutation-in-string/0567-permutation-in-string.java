class Solution {
    public boolean checkInclusion(String s1, String s2) {

//         if(s1.length()> s2.length()){
//             return false;
//         }

//         HashMap<Character,Integer> s1map = new HashMap<>();
//         HashMap<Character,Integer> s2map = new HashMap<>();

//         for(int i = 0; i<s1.length();i++){
//             if(s1map.containsKey(s1.charAt(i))){
//                 s1map.put(s1.charAt(i),s1map.get(s1.charAt(i))+1);
//             }
//             else{
//                 s1map.put(s1.charAt(i),1);
//             }
//         }

//         int left = 0;
//         for(int right = 0; right<s2.length();right++){
//             if(s2map.containsKey(s2.charAt(right))){
//                 s2map.put(s2.charAt(right),s2map.get(s2.charAt(right))+1);
//             }
//             else{
//                 s2map.put(s2.charAt(right),1);
//             }
//             if((right-left+1)>s1.length()){
//                char ch = s2.charAt(left);

//                 s2map.put(ch, s2map.get(ch) - 1);

//                 if(s2map.get(ch) == 0){
//                     s2map.remove(ch);
//                 }

//                 left++;         
//             }
            
//             if(s1map.equals(s2map)){
//                     return true;
//             }
            
//         }
//         return false;
        

        // 2nd approach using arrays

        if(s1.length()> s2.length()){
            return false;
        }

        //only lower case letters
        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);

            s1freq[ch - 'a']++;
        }
        int k = s1.length();

        // filling and sliding through s2 string

        for(int i = 0; i < s2.length();i++){
            // first fill the s2 array
            char ch = s2.charAt(i);
            s2freq[ch - 'a']++;

            // checking if length exceed k
            if(i>=k){
                s2freq[s2.charAt(i-k) - 'a']--;
            }

            //checking if permutation found or not for size k
            if(i >= k-1){
                if(Arrays.equals(s1freq,s2freq)){
                    return true;
                }
            }
        }

        return false;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
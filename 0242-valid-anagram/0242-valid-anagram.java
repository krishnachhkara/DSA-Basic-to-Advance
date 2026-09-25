class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0 ; i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            }
            else{
                sMap.put(s.charAt(i),1);
            }
        }

        for(int i = 0 ; i<t.length();i++){
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),tMap.get(t.charAt(i))+1);
            }
            else{
                tMap.put(t.charAt(i),1);
            }
        }

        if(sMap.equals(tMap)){
            return true;
        }

        return false;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
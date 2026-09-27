class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> pmap = new HashMap<>();  
        ArrayList<Integer> list = new ArrayList<>();

        // filling pmap
        for(int i = 0; i<p.length();i++){
            if(pmap.containsKey(p.charAt(i))){
                pmap.put(p.charAt(i),pmap.get(p.charAt(i))+1);
            }
            else{
                pmap.put(p.charAt(i),1);
            }
        } 

        int left = 0;

        for(int right = 0; right<s.length();right++){
            //map filling logic
            if(smap.containsKey(s.charAt(right))){
                smap.put(s.charAt(right),smap.get(s.charAt(right))+1);
            }
            else{
                smap.put(s.charAt(right),1);
            }

            //map size limit logic
            if((right-left+1)>p.length()){
                char ch = s.charAt(left);

                smap.put(ch,smap.get(ch)-1);

                if(smap.get(ch) == 0){
                    smap.remove(ch);
                }
                left++;

            }

           
            if(pmap.equals(smap)){
                list.add(left);
            }
            
        }

        return list;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
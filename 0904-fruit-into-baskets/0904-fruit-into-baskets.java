class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxlen = 0;

        //creating hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        //now create window and slide
        for(int right = 0; right < fruits.length; right++){
            // add and remove values and then check map condition ;
            
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                int outgoing = fruits[left];
                map.put(outgoing,map.get(outgoing)-1);

                if(map.get(outgoing) == 0){
                    map.remove(outgoing);
                }
                left++;
            }

            if(map.size()<=2){
                int len = right - left + 1;
                maxlen = maxlen > len ? maxlen : len;
            }
        }

        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
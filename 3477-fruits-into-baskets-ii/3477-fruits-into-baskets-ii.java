class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplcount = 0;

        for(int i = 0; i < fruits.length;i++){
            //using a boolean variable to find placement

                boolean placed = false;
            for(int j = 0; j<baskets.length;j++){

                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0;// to mark basket is occupied;
                    placed = true;
                    break;
                }

            }
            if(!placed){
                unplcount++;
            }
            
        }

        return unplcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
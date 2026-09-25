class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice; 
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
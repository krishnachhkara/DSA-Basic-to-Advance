class Solution {
    public boolean isHappy(int n) {
        // calculate sum 
        // initialise fast and slow 
        // return

        int slow = n;
        int fast = n;

        while(fast != 1){
            slow = sumOfDigits(slow);
            fast = sumOfDigits(sumOfDigits(fast));// move 2 steps

            if(fast == 1){
                return true;
            }
            if(slow == fast){
                return false;
            }
        }

        return true;
    }

    public int sumOfDigits(int num){
        int sum = 0;

        while(num>0){
            int lastdigit = num % 10;
            sum = sum + (lastdigit * lastdigit);
            num = num / 10;
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
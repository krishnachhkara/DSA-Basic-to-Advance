*  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        if(x1<x2){
            if(v1>v2 && ((x2-x1) % (v2-v1) == 0)){
                return "YES";
            }
        }
        else{
            if(v1<v2 && ((x2-x1) % (v2-v1) == 0) ){
                return "YES";
            }
        }
        return "NO";
    }

}

public class Solution {
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
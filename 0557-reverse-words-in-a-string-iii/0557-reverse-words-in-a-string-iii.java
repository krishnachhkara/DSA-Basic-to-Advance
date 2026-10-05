class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < s.length()){
            sb.append(s.charAt(i));
            i = i + 1;
        }

        int start = 0;
        int end = 0;

        while(start < sb.length()){
            while(end < sb.length() && sb.charAt(end) != ' '){
                end = end + 1;
            }

            int p1 = start;
            int p2 = end - 1;

            while(p1 < p2){
                char temp = sb.charAt(p1);
                sb.setCharAt(p1,sb.charAt(p2));
                sb.setCharAt(p2,temp);

                p1++;
                p2--;
            }

            end = end + 1;
            start = end;
        }

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
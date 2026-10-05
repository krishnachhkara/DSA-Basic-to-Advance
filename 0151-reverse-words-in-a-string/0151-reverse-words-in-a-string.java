class Solution {
    public String reverseWords(String s) {
        // trim 
        // get values for l,s,r
        // remove middle spaces
        // reverse the string
        // then reverse the words in string builder

        int l = 0;
        int r = s.length()-1;

        // removing leading spaces
        while(l < s.length()){
            if(s.charAt(l) == ' '){
                l = l + 1;
            }
            else{
                break;
            }
        }

        //removing trailing spaces
        while(r >= 0){
            if(s.charAt(r) == ' '){
                r = r - 1;
            }
            else{
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        // from above loops we get the values of l and r;
        // removing middle extra spaces
        while(l <= r){
            if(s.charAt(l) != ' '){
                sb.append(s.charAt(l));
                l = l + 1;
            }
            else if(s.charAt(l) == ' '){
                if(s.charAt(l) == sb.charAt(sb.length()-1)){
                    l = l + 1;
                }
                else{
                    sb.append(s.charAt(l));
                }
            }

        }

        // after this sb has -> "the_hello"

        // now reverse the string builder

        int i = 0,
            j = sb.length() - 1;

        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);

            i = i + 1;
            j = j - 1;
        }    

        // sb = "oellh_eht"

        // now reverse the words;
        // for this we need two more pointers to work with;

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

                p1 = p1 + 1;
                p2 = p2 - 1;
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
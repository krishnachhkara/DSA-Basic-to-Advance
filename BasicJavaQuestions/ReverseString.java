import java.util.Scanner;

public class ReverseString {
    static String Reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;

    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(); // for one word we use next;
        String reversed = Reverse(s);
        System.out.println(reversed);
        in.close();
    }
}

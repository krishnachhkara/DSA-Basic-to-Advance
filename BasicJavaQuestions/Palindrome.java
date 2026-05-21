import java.util.Scanner;

public class Palindrome {
    static boolean PalindromeNumber(int n) {
        int m = n;
        int rev = 0;
        while (m > 0) {
            int digit = m % 10;
            rev = rev * 10 + digit;
            m = m / 10;
        }
        if (rev == n) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean result = PalindromeNumber(number);
        System.out.println(result);
        in.close();
    }
}

import java.util.Scanner;

public class PerfectNumber {
    static boolean num(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }

        }
        if (sum == n) {
            return true;
        }
        return false;

    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean result = num(number);
        System.out.println(result);
        in.close();

    }
}

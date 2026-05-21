import java.util.Scanner;

public class SumOfDigits {
    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = sum(num);
        System.out.println(result);
        in.close();

    }
}

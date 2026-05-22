import java.util.Scanner;

public class EvenOdd {
    static String evenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(evenOdd(num));
        in.close();
    }
}

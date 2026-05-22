import java.util.Scanner;

public class Product {
    static int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(multiply(a, b));
        in.close();
    }
}

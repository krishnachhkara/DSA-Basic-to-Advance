import java.util.Scanner;

public class NPRNCR {
    static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        double npr = factorial(n) / factorial(n-r);
        double ncr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(npr);
        System.out.println(ncr);
        // int temp = factorial(n); used for checking the function
        // System.out.println(temp);
        in.close();
    }
}

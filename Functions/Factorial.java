import java.util.Scanner;

public class Factorial {
    static int fact(int n) {
        int factorial = 1;
        if (n == 1 && n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = fact(num);
        System.out.println(result);
        in.close(); 
    }
}

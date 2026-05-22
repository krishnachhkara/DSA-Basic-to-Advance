import java.util.Scanner;

public class PrimeNum {
    static boolean isPrime(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean result = isPrime(num);
        System.out.println(result);
        in.close();
    }
}

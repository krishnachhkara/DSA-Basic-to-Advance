import java.util.Scanner;

public class PrimeinRange {
    static boolean isPrime(int n) {
        int i = 2;
        if (n < 2) {
            return false;
        }
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }

    static void PrintPrimeinRange(int start, int end) {
        for (int i = start; i <=end; i++) {
            // System.out.println(i+ " " + isPrime(i));
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        PrintPrimeinRange(start, end);
        in.close();
    }
}

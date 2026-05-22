import java.util.Scanner;

public class SumofN {
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
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

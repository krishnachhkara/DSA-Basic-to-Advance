import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        double number = in.nextDouble();
        for (int i = 1; i < n; i++) {
            sum = sum + number;
            number = in.nextDouble();
        }
        System.out.println(sum);
        in.close();     
    }
}

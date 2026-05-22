import java.util.Scanner;

public class SumOfTwoNum {
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a, b));
        in.close();
    }
}

import java.util.Scanner;

public class Lcm {
    static int lcm(int a, int b) {
        int product = a * b;
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int LCM = product / a;
        return LCM;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = lcm(a, b);
        System.out.println(result);
        in.close();
    }
}

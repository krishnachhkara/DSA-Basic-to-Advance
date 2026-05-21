import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int result = 1;
        int power = in.nextInt();
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.println(result);
        in.close();
            
    }
}

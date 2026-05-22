import java.util.Scanner;

public class Vote {
    static String eligible(int n) {
        if (n >= 18) {
            return "Eligible to Vote";
        }
        else {
            return "Not eligible";
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(eligible(num));
        in.close();

    }
}

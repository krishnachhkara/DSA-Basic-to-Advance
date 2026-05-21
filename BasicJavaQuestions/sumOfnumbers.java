import java.util.Scanner;

public class sumOfnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        while (number != 0) {
            sum = sum + number;
            number = in.nextInt();
        }
        System.out.println(sum);
        in.close();
    }
    
}

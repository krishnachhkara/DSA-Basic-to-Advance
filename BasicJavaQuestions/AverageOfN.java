import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        int sum = 0;
        while (number != 0) {
            count = count + 1;
            sum = sum + number;
            number = in.nextInt();
        }
        double Avg = 0;
        Avg = sum / count;
        System.out.println(Avg);
        in.close();
    }
}

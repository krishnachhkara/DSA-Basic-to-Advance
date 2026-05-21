import java.util.Scanner;

public class sumOfPosiandNegi {
    static int sum() {
        Scanner in = new Scanner(System.in);
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0 && n % 2 == 0) {
                positiveEvenSum += n;
            }
            if (n < 0) {
                negativeSum += n;
            }
            if (n > 0 && n % 2 != 0) {
                positiveOddSum += n;
            }
        }
        System.out.println(positiveEvenSum);
        System.out.println(positiveOddSum);
        System.out.println(negativeSum);


        in.close();
        return 0;
    }

    public static void main(String[] args) {
        
        sum();
        
    }
}

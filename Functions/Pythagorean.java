import java.util.Scanner;

public class Pythagorean {
    static boolean PythagoreanTriplet(int h, int p, int b) {
        int square = p * p + b * b;
        int hyposq = h * h;
        if (hyposq == square) {
            return true;
        }
        return false;
        // return (h * h) == (p * p + b * b); better version

    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hypo = in.nextInt();
        int perp = in.nextInt();
        int base = in.nextInt();
        boolean result = PythagoreanTriplet(hypo, perp, base);
        System.out.println(result);
        in.close();
    }
}

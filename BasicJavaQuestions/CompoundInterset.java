import java.util.Scanner;

public class CompoundInterset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal = in.nextDouble();
        double rate = in.nextDouble();
        double time = in.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double CompoundInterset = amount - principal;
        System.out.println(CompoundInterset);
        in.close();
    }
}

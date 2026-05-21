import java.util.Scanner;

public class futureInvestement {
    // formula FV=P(1+r)^t

    static double FV(double p, double r, float t) {
        double fv = p * Math.pow((1 + r), t);
        return fv;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal = in.nextDouble();
        double rate = in.nextDouble();
        float time = in.nextFloat();
        double investement = FV(principal, rate, time);
        System.out.println(investement);
        in.close();
    }
}

import java.util.Scanner;

public class distanceBetweenPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y1 = in.nextDouble();
        double y2 = in.nextDouble();

        double distanceBetweenPoints = Math.sqrt(
                Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println(distanceBetweenPoints);
        in.close();
    }
}

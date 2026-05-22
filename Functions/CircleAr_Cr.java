import java.util.Scanner;

public class CircleAr_Cr {
    static void area_cr(int r) {
        double cr = 2 * 3.14 * r;
        double ar = 3.14 * r * r;
        System.out.println(cr);
        System.out.println(ar);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        area_cr(radius);
        in.close();

    }
}

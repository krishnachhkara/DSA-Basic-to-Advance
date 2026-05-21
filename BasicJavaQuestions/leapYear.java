import java.util.Scanner;

public class leapYear {
    static boolean leap(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        boolean result = leap(year);
        System.out.println(result);
        in.close();
    }
}

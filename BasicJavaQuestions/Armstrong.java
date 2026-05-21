import java.util.Scanner;

public class Armstrong {
    static boolean ArmNum(int num,int len) {
        
        int m = num;
        int sum = 0;
        while (m > 0) {
            int div = m % 10;
            sum = sum + (int)Math.pow(div, len);
            m = m / 10;
        }
        if (sum == num) {
            return true;
       }
        
        return false;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digits = String.valueOf(num).length();
        boolean armstrong = ArmNum(num,digits);
        System.out.println(armstrong);
        in.close();
    }
}

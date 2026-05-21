import java.util.Scanner;

public class Hcf {
    static int HCF(int a, int b) {
        while (b>0) {
            int temp = b;

            b = a % b;
    
            a = temp;
        }
        
       
        return a;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = HCF(a, b);
        System.out.println(result);
        in.close();
    }
}

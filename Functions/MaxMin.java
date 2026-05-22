import java.util.Scanner;

public class MaxMin {
    static int max(int n1, int n2, int n3) {
        int maximum = n1;
        if (n2 > maximum) {
            maximum = n2;

        }
        if (n3 > maximum) {
            maximum = n3;
        }
        return maximum;
       

    }

    static int min(int n1,int n2,int n3) {
        int mini = n1;
        if (n2 < mini) {
            mini = n2;

        }
        if (n3 < mini) {
            mini = n3;
        }
        return mini;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int maximum = max(num1, num2, num3);
        int minimum = min(num1, num2, num3);
        System.out.println(maximum);
        System.out.println(minimum);
        in.close();
    }
}

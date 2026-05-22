import java.util.Scanner;

public class Grade {
    static void score(int n) {
        if (91 <= n && n <= 100) {
            System.out.println("AA");
        } else if (81 <= n && n <= 90) {
            System.out.println("AB");
        } else if (71 <= n && n <= 80) {
            System.out.println("BB");
        } else if (61 <= n && n <= 70) {
            System.out.println("BC");
        } else if (51 <= n && n <= 60) {
            System.out.println("CD");
        } else if (41 <= n && n <= 50) {
            System.out.println("DD");
        } else if (n <= 40) {
            System.out.println("Fail");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        score(marks);
        in.close();
    }
}

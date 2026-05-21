import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int subjects = in.nextInt();
        double marks = in.nextDouble();
        double sum = 0;
        double AverageMarks = 0;
        while (marks != 0) {
            sum = sum + marks;
            marks = in.nextDouble();
        }          
        AverageMarks = sum / subjects;
        System.out.println(AverageMarks);
        in.close();


    }
}

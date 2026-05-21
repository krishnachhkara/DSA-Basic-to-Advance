import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int Largest = 0;
        while (number != 0) {
            if (number > Largest) {
                Largest = number;
            }
            number = in.nextInt();

        }
        System.out.println(Largest);
        in.close();
    }
    
}

import java.util.Scanner;

public class VowelConsonant {
    static void VC_check(Character s) {
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Character str = in.next().toLowerCase().charAt(0);
        VC_check(str);
        in.close();

    }
}

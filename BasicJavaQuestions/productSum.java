public class productSum {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int digits = 3524634;
        while (digits > 0) {
            int digit = digits % 10;
            sum = sum + digit;
            product = product * digit;
            digits = digits / 10;

        }
        int result = product - sum;
        System.out.println(result);
    }
    
}

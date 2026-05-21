public class fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int num = 8;
        int i = 0;
        while (i <= num) {
            System.out.println(second);
            int temp = second;
            second = first + second;
            first = temp;
            
            i++;
        }
    }
    
}

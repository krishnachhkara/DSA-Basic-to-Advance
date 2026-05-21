import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();
        double discount = in.nextDouble();
        double discounted_price = (discount * price) / 100;
        double finalPrice = price - discounted_price;
        System.out.println(finalPrice);
        in.close();
    }
}

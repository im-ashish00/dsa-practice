import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        // Iterative approach
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list price and discount rate (in percentages): ");
        int listPrice = input.nextInt();
        int discountRate = input.nextInt();
        int discount = listPrice * discountRate / 100;
        System.out.println("Discount Price: " + discount);
    }
}
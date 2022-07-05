import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        // Iterative approach
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sale price and commission amount: ");
        float salePrice = input.nextFloat();
        float commissionAmount = input.nextFloat();
        float commissionPercentage = (commissionAmount / salePrice) * 100;
        System.out.println("Discount Price: " + commissionPercentage + "%");
    }
}
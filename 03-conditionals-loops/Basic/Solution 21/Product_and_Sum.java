import java.util.Scanner;

public class Product_and_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            product *= lastDigit;
            sum += lastDigit;
        }
        System.out.println(product - sum);
    }
}

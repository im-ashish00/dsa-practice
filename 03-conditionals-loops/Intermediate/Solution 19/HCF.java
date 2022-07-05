import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        // using Division algorithm
        int dividend = input.nextInt();
        int divisor = input.nextInt();
        int remainder = dividend % divisor;
        while (remainder > 0) {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }
        System.out.println("GCD or HCF: " + divisor);
    }
}

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        // using Division algorithm
        int dividend = input.nextInt();
        int divisor = input.nextInt();
        int n1 = dividend;
        int n2 = divisor;
        int remainder = dividend % divisor;
        while (remainder > 0) {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }
        int gcd = divisor;
        System.out.println("LCM is: " + (n1 * n2) / gcd);
    }
}

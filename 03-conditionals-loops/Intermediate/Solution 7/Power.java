import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Iterative approach
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and exponent: ");
        int base = input.nextInt();
        int exponent = input.nextInt();
        int answer = base;
        for (int i = 1; i < exponent; i++) {
            if (exponent == 0) {
                answer = 1;
                break;
            }
            answer *= base;
        }
        System.out.println("Power: " + answer);
    }
}
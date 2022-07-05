import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Iterative approach
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int answer = 1;
        for (int i = number; i > 0; i--) {
            answer *= i;
        }
        System.out.println("Factorial: " + answer);
    }
}
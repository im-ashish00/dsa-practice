import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Iterative approach
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Sum of the n numbers is: " + n * (n + 1) / 2);
    }
}
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Iterative approach
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Average of the numbers is: " + sum / n);
    }
}
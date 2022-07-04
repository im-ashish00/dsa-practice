import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int sum = number;
        while (number != 0) {
            System.out.print("Enter the number: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is: " + sum);
    }
}

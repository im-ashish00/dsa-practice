import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int max = number;
        while (number != 0) {
            System.out.print("Enter the number: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The largest number is: " + max);
    }
}

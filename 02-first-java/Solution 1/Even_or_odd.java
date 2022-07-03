import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("It is an Even number.");
        } else {
            System.out.println("It is an Odd number.");
        }

    }
}

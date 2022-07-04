import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers to add: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int add = number1 + number2; // It will treat it as a string if pass this in the print
        System.out.println("Addition: " + add);
    }
}

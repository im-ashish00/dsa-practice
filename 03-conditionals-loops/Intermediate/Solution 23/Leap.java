import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year.");
                } else {
                    System.out.println("Not a Leap Year.");
                }
            } else {
                System.out.println("Leap year.");
            }

        } else {
            System.out.println("Not a Leap Year.");
        }
    }
}

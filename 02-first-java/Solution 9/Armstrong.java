import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            boolean isArmstrongNumber = isArmstrong(i);
            if (isArmstrongNumber) {
                System.out.println("First Armstrong number is: " + i);
                break;
            }
        }
    }

    static boolean isArmstrong(int number) {
        int cubesSum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            cubesSum += digit * digit * digit;
            number = number / 10;
        }
        if (originalNumber == cubesSum) {
            return true;
        }
        return false;
    }
}

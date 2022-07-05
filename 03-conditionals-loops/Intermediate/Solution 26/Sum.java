import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int negativeNumbersSum = 0, positiveEvenNumbers = 0, positiveOddNumbers = 0;
        if (number < 0) {
            negativeNumbersSum = number;
        } else if (number % 2 == 0) {
            positiveEvenNumbers = number;
        } else {
            positiveOddNumbers = 0;
        }
        while (number != 0) {
            System.out.print("Enter the number: ");
            number = input.nextInt();
            if (number < 0) {
                negativeNumbersSum += number;
            }
            if (number > 0 && number % 2 == 0) {
                positiveEvenNumbers += number;
            }
            if (number > 0 && number % 2 != 0) {
                positiveOddNumbers += number;
            }
        }
        System.out.println("Sum of negative numbers: " + negativeNumbersSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenNumbers);
        System.out.println("Sum of positive odd numbers: " + positiveOddNumbers);
    }
}

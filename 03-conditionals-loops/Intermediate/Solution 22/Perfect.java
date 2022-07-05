import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int sumOfFactors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        if (sumOfFactors == number) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number.");
        }
    }
}

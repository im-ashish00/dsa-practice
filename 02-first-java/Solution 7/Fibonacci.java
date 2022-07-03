import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to know Fibonacci of: ");
        int num = input.nextInt();
        int previousValue = 0;
        int frontValue = 1;
        for (int i = 1; i < num - 1; i++) {
            int temp = frontValue;
            frontValue = previousValue + frontValue;
            previousValue = temp;
        }
        System.out.print(frontValue);
    }
}

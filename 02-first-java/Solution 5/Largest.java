import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number with a space: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b) {
            System.out.println("Number 1 is greater.");
        }
        if (a < b) {
            System.out.println("Number 2 is greater.");
        } else {
            System.out.println("Both of them are equal.");
        }
    }
}

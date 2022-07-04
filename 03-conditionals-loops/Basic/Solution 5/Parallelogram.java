import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and a height of the parallelogram : ");
        int base = input.nextInt();
        int height = input.nextInt();
        System.out.print("Area of the Parallelogram is " + base * height);
    }
}

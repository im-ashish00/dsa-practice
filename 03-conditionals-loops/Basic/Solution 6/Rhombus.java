import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two diagonals of Rhombus: ");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        System.out.print("Area of the Parallelogram is " + 0.5 * d1 * d2);
    }
}

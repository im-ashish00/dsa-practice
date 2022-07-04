import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and a side of the parallelogram : ");
        int base = input.nextInt();
        int side = input.nextInt();
        System.out.print("Perimeter of the Parallelogram is " + 2 * (base + side));
    }
}

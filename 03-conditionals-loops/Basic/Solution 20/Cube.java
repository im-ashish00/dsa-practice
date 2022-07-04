import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of the cube: ");
        int side = input.nextInt();
        System.out.print("Total surface area of cube is " + 6 * side * side);
    }
}

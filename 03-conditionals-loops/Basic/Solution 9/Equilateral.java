import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the equal side of the equilateral triangle : ");
        int side = input.nextInt();
        System.out.print("Perimeter of the equilateral triangle is " + (3 * side));
    }

}

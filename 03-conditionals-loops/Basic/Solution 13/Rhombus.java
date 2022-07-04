import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of the rhombus: ");
        int side = input.nextInt();
        System.out.print("Perimeter of rhombus is " + 4 * side);
    }
}

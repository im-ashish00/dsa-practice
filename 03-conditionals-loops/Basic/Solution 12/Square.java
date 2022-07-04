import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        int side = input.nextInt();
        System.out.print("Perimeter of square is " + 4 * side);
    }
}

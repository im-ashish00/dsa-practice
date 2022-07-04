import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breadth and a length of the rectangle : ");
        int breadth = input.nextInt();
        int length = input.nextInt();
        System.out.print("Perimeter of the Rectangle is " + 2 * (length + breadth));
    }
}

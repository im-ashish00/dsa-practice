import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length, breadth and height of the pyramid : ");
        float length = input.nextFloat();
        float breadth = input.nextFloat();
        float height = input.nextFloat();
        System.out.print("Volume of the Pyramid is " + length * breadth * height / 3);
    }
}

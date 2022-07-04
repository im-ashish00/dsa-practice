import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        // Curved surface area
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and height of the cylinder: ");
        float radius = input.nextFloat();
        float height = input.nextFloat();
        System.out.printf("Curved surface area of the cylinder is %.3f", 2 * Math.PI * radius * height);
    }
}

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and height of the cylinder: ");
        float radius = input.nextFloat();
        float height = input.nextFloat();
        System.out.printf("Volume of the cylinder is %.3f", Math.PI * radius * radius * height);
    }
}

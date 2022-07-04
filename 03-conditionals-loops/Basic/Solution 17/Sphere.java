import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        float radius = input.nextFloat();
        System.out.printf("Volume of the sphere is %.3f", 4 * Math.PI * Math.pow(radius, 3) / 3);
    }
}

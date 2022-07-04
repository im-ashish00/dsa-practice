import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        System.out.printf("Area of the Circle is %.3f", Math.PI * radius * radius);
    }
}

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius and height of the cone: ");
        float radius = input.nextFloat();
        int height = input.nextInt();
        float volume = ((float) Math.PI * radius * radius * height) / 3;
        System.out.print("Volume of the cone is " + volume);
    }
}

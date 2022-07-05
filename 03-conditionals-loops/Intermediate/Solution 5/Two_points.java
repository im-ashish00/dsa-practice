import java.util.Scanner;

public class Two_points {
    public static void main(String[] args) {
        // Cost Per Hour = kWh x Unit Price
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coordinates of first point: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("Enter coordinates of second point: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between the points is: " + distance);
    }
}

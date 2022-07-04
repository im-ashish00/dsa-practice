import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and a height of the triangle : ");
        int base = input.nextInt();
        int height = input.nextInt();
        System.out.print("Area of the Triangle is " + 0.5 * base * height);
    }
}

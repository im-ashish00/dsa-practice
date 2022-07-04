import java.util.Scanner;

public class Prism {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base area (length * breadth) and height of the prism : ");
        int baseArea = input.nextInt();
        int height = input.nextInt();
        System.out.print("Volume of Prism is " + baseArea * height);
    }
}

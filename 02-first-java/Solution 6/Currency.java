import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in Rs(₹): ");
        int value = input.nextInt();
        System.out.println("It is " + "$ " + value / 78.98);
    }
}

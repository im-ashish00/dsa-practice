import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal, rate, time in order with spaces: ");
        int principal = input.nextInt();
        float rate = input.nextFloat();
        int time = input.nextInt();
        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

}

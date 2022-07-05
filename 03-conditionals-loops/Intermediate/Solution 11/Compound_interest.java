import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal, rate, time in order with spaces: ");
        float principal = input.nextFloat();
        float rate = input.nextFloat();
        float time = input.nextFloat();
        double compoundInterest = principal * Math.pow((1 + rate / 100), time);
        System.out.println("Compound Interest: " + compoundInterest);
    }

}

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers with a space: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        float answer = 0;
        switch (operator) {
            case '+':
                answer = a + b;
                System.out.println(answer);
                break;
            case '-':
                answer = a - b;
                System.out.println(answer);
                break;
            case '*':
                answer = a * b;
                System.out.println(answer);
                break;
            case '/':
                answer = a / b;
                System.out.println(answer);
                break;
            default:
                System.err.println("Enter Valid Operator");
        }
    }

}

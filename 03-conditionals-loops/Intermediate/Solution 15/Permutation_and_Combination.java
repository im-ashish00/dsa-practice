import java.util.Scanner;

public class Permutation_and_Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n and r: ");
        int n = input.nextInt();
        int r = input.nextInt();
        int nPr = factorial(n) / factorial(n - r);
        int nCr = factorial(n) / (factorial(n - r) * factorial(r));
        System.out.println("Permutations: " + nPr);
        System.out.println("Combinations: " + nCr);
    }

    static int factorial(int number) {
        int answer = 1;
        for (int i = 1; i <= number; i++) {
            answer *= i;
        }
        return answer;
    }
}
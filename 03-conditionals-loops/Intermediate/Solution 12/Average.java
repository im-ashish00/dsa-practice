import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter number of subjects");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        double avg = 0;

        System.out.println("Enter marks");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            avg += a[i];
        }

        System.out.print("Average: " + avg / n);
    }
}

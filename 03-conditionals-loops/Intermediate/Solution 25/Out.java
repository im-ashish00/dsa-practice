import java.util.Scanner;

public class Out {
    public static void main(String[] args) {
        int numberOfDaysInAugust = 31;
        int allowedDays = 0;
        for (int i = 1; i <= numberOfDaysInAugust; i++) {
            if (i % 2 == 0) {
                allowedDays++;
            }
        }
        System.out.println("Number of days he's allowed: " + allowedDays);
    }
}

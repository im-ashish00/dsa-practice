import java.util.Scanner;

public class Grade {
    static String getGrade(int m) {
        if (m > 90 && m <= 100)
            return "AA";
        else if (m > 80 && m <= 90)
            return "AB";
        else if (m > 70 && m <= 80)
            return "BB";
        else if (m > 60 && m <= 70)
            return "BC";
        else if (m > 50 && m <= 60)
            return "CD";
        else if (m > 40 && m <= 50)
            return "DD";
        else if (m <= 40 && m > -1)
            return "Fail";
        else
            return "Enter value marks";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int marks = input.nextInt();
        System.out.println("Grade: " + getGrade(marks));
    }

}
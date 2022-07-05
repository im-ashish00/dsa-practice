import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next().toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);

    }
}

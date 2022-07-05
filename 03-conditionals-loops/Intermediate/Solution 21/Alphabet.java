import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        // Iterative approach
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String enteredString = input.next();
        char alphabet = enteredString.charAt(0);
        if (enteredString.length() == 1) {
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'o' || alphabet == 'i' || alphabet == 'o'
                    || alphabet == 'u') {
                System.out.println("Vowel.");
            } else {
                System.out.println("Consonent.");
            }
        } else {
            System.out.println("Enter valid alphabet.");
        }
    }
}
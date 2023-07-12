package homework.week2;
import java.util.Scanner;

public class Q3_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your String: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        for (int i = 0; i < (input.length() / 2); i++) {
            if (input.charAt(i) == input.charAt((input.length() - 1) - i)) {
                continue;
            }
            else {
                System.out.println("Not a Palindrome");
                System.exit(1);
            }
        }
        System.out.println("Is a Palindrome");
    }
}

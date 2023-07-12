package homework.week1;
import java.util.Scanner;

public class Q3_Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int firstDigit = number % 10;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = (number / 100) % 10;

        System.out.println(firstDigit * secondDigit * thirdDigit);
    }
}

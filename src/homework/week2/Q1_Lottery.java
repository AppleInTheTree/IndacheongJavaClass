package homework.week2;
import java.util.Scanner;
import java.util.Random;
public class Q1_Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your two digit number: ");

        int inputNumber = scanner.nextInt();
        int firstDigit = inputNumber % 10;
        int secondDigit = inputNumber / 10;

        int answer = random.nextInt(99);
        int randFirstDigit = answer % 10;
        int randSecondDigit = answer / 10;
        System.out.println("Your input is " + inputNumber + " Answer is " + answer);

        if (inputNumber == answer) {
            System.out.println("First Place");
        }
        else if (firstDigit == randSecondDigit && secondDigit == randFirstDigit) {
            System.out.println("Second Place");
       }
        else if ((firstDigit == randFirstDigit) || (firstDigit == randSecondDigit) || (secondDigit == randFirstDigit) || (secondDigit == randSecondDigit)) {
            System.out.println("Third Place");
        }
        else {
            System.out.println("Bye~!");
        }


    }
}

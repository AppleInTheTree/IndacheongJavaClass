package grammer.week2;
import java.util.Scanner;
import java.util.Random;
public class G3_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isTrue = true;

        int randNumber = random.nextInt(10);

        while (true) {

            System.out.println("Enter a new number: ");

            int inputNumber = scanner.nextInt();

            if (randNumber > inputNumber) {
                System.out.println("Too Low");
            }
            else if (randNumber < inputNumber) {
                System.out.println("Too High");
            }
            else {
                System.out.println("Bingo");
//                isTrue = false;
            }
        }

    }
}

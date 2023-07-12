package grammer.week2;
import java.util.Scanner;
import java.util.Random;
public class G2_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int inputNumber  = scanner.nextInt();
        int randNumber = random.nextInt(20);

        if (inputNumber > randNumber) {
            System.out.println("Too High");
        }
        else if (inputNumber < randNumber) {
            System.out.println("Too Low");
        }
        else {
            System.out.println("Bingo");
        }
    }

}

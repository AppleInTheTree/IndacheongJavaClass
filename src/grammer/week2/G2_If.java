package grammer.week2;
import java.util.Scanner;
import java.util.Random;
public class G2_If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int randNumber = random.nextInt(10);

        System.out.println(randNumber);

        if (number < randNumber) {
            System.out.println("Number is too small");
        }
        else if (number > randNumber) {
            System.out.println("Number is too big");
        }
        else {
            System.out.println("Bingo");
        }















//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int inputNumber  = scanner.nextInt();
//        int randNumber = random.nextInt(20);
//
//        if (inputNumber > randNumber) {
//            System.out.println("Too High");
//        }
//        else if (inputNumber < randNumber) {
//            System.out.println("Too Low");
//        }
//        else {
//            System.out.println("Bingo");
//        }
    }

}

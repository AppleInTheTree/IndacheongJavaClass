package grammer.week2;
import java.util.Scanner;
import java.util.Random;

public class G1_Boolean {
    public static void main(String[] args) {

        boolean isFalse = false;


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();


        double randNumber = random.nextInt(10);

        System.out.println(number == randNumber);






//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int rand = random.nextInt(10);
//        int input  = scanner.nextInt();
//
//        System.out.println("Is rand and input " +
//                "has same number ? " + " rand is " +
//                rand + " input is " + input + " " +  (rand == input));


    }
}

package grammer.week2;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class G1_Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rand = random.nextInt(10);
        int input  = scanner.nextInt();

        System.out.println("Is rand and input " +
                "has same number ? " + " rand is " +
                rand + " input is " + input + " " +  (rand == input));


    }
}

package grammer.week2;
import java.util.Scanner;
public class G6_ConditionalOperators {
    public static void main(String[] args) {
        System.out.println("Enter a color: ");
        Scanner scanner = new Scanner(System.in);

        String color = scanner.next();
        String answer = "red";

        System.out.println(color.equals(answer) ? "red" : ("other color " + color));
    }
}



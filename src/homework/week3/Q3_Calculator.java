package homework.week3;
import java.util.Scanner;
public class Q3_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your two number ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(add(a, b));
        System.out.println(mul(a, b));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
}

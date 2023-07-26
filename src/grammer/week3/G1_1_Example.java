package grammer.week3;
import java.util.Scanner;
public class G1_1_Example {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(add(num1, num2));
        System.out.println(mul(num1, num2));

    }


    // 더하기 함수
    static int add(int a, int b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return (a * b);
    }


}

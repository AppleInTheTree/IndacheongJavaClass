package grammer.week2;
import java.util.Scanner;
public class G9_ContinueBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum  = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue; //break 랑 차이점 보여주기
            }
            sum += number;
        }
        System.out.println("Sum is : " + sum);
    }

}

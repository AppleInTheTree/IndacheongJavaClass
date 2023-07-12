package grammer.week2;
import java.util.Scanner;
public class G7_ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println( i + " * " + j + " = " + (i * j));
            }
        }


    }
}

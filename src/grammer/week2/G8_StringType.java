package grammer.week2;
import java.util.Scanner;

public class G8_StringType {
    public static void main(String[] args) {

        String message = "Welcome to IndaCheong";

        System.out.println("Length of the message is " + message.length());
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
        }

        System.out.println();
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        // indexOf() 알려주기

    }
}

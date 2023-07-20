package grammer.week3;

public class G2_MethodTwo {

    // void vs, Value-Returning Methods


    public static void main(String[] args) {

        printHello();
        printNumber(6);

    }


    static void printHello() {
        System.out.println("Hello");
    }

    static int printNumber(int i) {
        System.out.println("i = " + i);
        return i;
    }
}

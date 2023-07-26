package grammer.week3;

public class G5_Scope {

    public static void main(String[] args) {
        int a = 0;
        // i를 쓰고 for 안에 또 i 를 쓰는 것은 안된다.
        for(int j = 1; j < 10; j++) {
            System.out.println("j = " + j);
        }

        printHello("Bye");
    }

    public static void printHello(String a) {
        System.out.println(a);
    }



}

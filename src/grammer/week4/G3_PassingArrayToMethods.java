package grammer.week4;

public class G3_PassingArrayToMethods {
    public static void main(String[] args) {

        // array 는 일반 변수와 다르게 주소값을 복사해서 넘기기 때문에 결과가 바뀐다

        int x = 1;

        int[] arrayOne = new int[5];

        arrayOne[0] = 1;
        System.out.println("x value is " + x + " and arrayOne[0] is " + arrayOne[0]);

        swap(x, arrayOne);

        System.out.println("x value is " + x + " arrayOne[0] = " + arrayOne[0]);

    }

    public static void swap(int x, int[] array) {

        x = 1000;
        array[0] = 5;
    }
}

package grammer.week4;

public class G2_CopyingArray {
    public static void main(String[] args) {

        // array1 = array2를 하면 array2 에 array1의 주소가 copy 된다.

        int[] arrayOne = {1, 2, 3};

        int[] arrayTwo = {1, 2, 4};

        System.out.println("Memory address of the arrayOne " + arrayOne + " Memory address of the arrayTwo " + arrayTwo);

        arrayTwo = arrayOne;

        System.out.println("Memory address of the arrayOne " + arrayOne + " Memory address of the arrayTwo " + arrayTwo);

    }
}

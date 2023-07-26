package grammer.week4;

public class G4_ReturningArrayMethod {
    public static void main(String[] args) {

        // 그러면 원본을 유지하면서 새로운 배열을 만들고 싶으면 어떡해야 할까?

        int[] arrayOne = new int[10];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = i;
        }
        for (int i : arrayOne) {
            System.out.println("i = " + i);            
        }



        int[] arrayTwo = reverse(arrayOne);

        for (int i : arrayTwo ) {
            System.out.println("arrayTwo element = " + i);
        }




    }

    public static int[] reverse(int[] array) {
        int[] arrayTwo = new int[array.length];

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = array[array.length - (1 + i)];
        }

        return arrayTwo;
    }

    // 이 방법ㄷ 있다.
//    public static void reverse(int[] array) {
//        int[] arrayTwo = new int[array.length];
//
//        for (int i = 0; i < arrayTwo.length; i++) {
//            arrayTwo[i] = array[array.length - (1 + i)];
//        }
//
//        array = arrayTwo
//    }
}

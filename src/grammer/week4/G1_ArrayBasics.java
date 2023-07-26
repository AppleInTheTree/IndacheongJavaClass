package grammer.week4;

import java.util.Scanner;

public class G1_ArrayBasics {


    // 어래이는 바구니라고 생각하면 된다.
    // 어레이는 만들어지면 사이즈가 고정된다.
    // 어레이는 같은 타입을 가진 변수들의 모음 이다.
    public static void main(String[] args) {

        // elementType[] arrayRefVar;
        // arrayRefVar = new elementType[arraySize]
        // 처음 만들때 값을 지정해주지 않으면 null 값이 들어간다.

        // 어레이 공강 만들어주기
        double[] arrayOne = new double[10];
        // 공간에 값 넣어주기

        arrayOne[0] = 4;
        arrayOne[1] = 5;
        arrayOne[2] = 3;

        // arrayOne 은 변수라고 말하는것 보다 arrayOne 은 double 배열의 주소값을 가진 변수예요 라고 하는것이 옳다.
        // 앞서 말했듯이 arraySize 는 생성한 후에 변경할 수 없다.

        // 어레이 크기 가져오기
        int arrayLength = arrayOne.length;

        // 어레이를 처음에 가져오고 아무런 값도 주지 않으면 숫자는 0, boolean 은 false 등이 기본값으로 지정된다.

        // 어레이 값은 0부터 시작 예를 들면 사이즈를 10으로 지정하면 0 ~ 9 까지 불러올수 있다.

        // ex) for 문을 사용해서 어레이에 값 넣어주기

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = i;
            System.out.println(arrayOne[i]);
        }

        // 어레이를 만드는 다른 방법으로 array-initializer 라는 문법도 쓸 수 있다.

        int[] arrayTwo = {1, 2, 3, 4, 5};

        System.out.println("The length of the arrayTwo is " + arrayTwo.length);

        // 어레이는 for 문 과 같이 많이 쓰게 된다.

        // 인풋을 for 문을 통해 array 안에 넣어주기

//        Scanner scanner = new Scanner(System.in);
//
//        int[] arrayThree = new int[5];
//
//        for (int i = 0; i < arrayThree.length; i++) {
//            arrayThree[i] = scanner.nextInt();
//
//            System.out.println("Input is " + arrayThree[i]);
//        }

        // ex) 가장 큰 수를 찾는 예제 -> arrayTwo 사용

        int max = arrayTwo[0];

        for (int i = 0; i < arrayTwo.length; i++) {
            if (max < arrayTwo[i]) {
                max = arrayTwo[i];
            }

        }
        System.out.println("largest number in a arrayTwo is a " + max);

        // 간단하게 min 찾는 연습 해보기.

        // forEach 문으로 뽑아낼수 있다.

        for (int i : arrayTwo) {
            System.out.println("elements of the arrayTwo " + i);
        }

        // array 처음 설정 크기보다 큰 값을 요구하면 ArrayIndexOutOfBoundsException 이 터진다.








    }
}

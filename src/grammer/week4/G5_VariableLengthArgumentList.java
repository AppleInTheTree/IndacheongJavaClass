package grammer.week4;

public class G5_VariableLengthArgumentList {
    public static void main(String[] args) {
        // A variable number of arguments of the same type can be passed to a method and treated as an array

        // typeName ... parameterName
        printMax(2, 3, 4, 5, 18);

        // 별로 좋은 방법은 아니지만 이렇게 어레이를 넘길수도 있다. new elelementType[] {value0, value1 ... }
        printMax(new int[] {43, 42, 12, 3});


    }

    public static void printMax(int ... numberArray) {

        if (numberArray.length == 0) {
            System.out.println("There is a no argument passsed");
            return;
        }

        int max = numberArray[0];

        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        System.out.println("max = " + max);
    }


}

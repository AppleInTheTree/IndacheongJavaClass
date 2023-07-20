package grammer.week3;

public class G4_MethodFour {
    // prime number refactoring
    public static void main(String[] args) {
        final int MAX = 50;
        int count = 0;
        int startingNum = 2;

        while (count < MAX) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < startingNum; divisor++) {
                if (startingNum % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(startingNum);
                }
                else {
                    System.out.print(startingNum + " ");
                }
            }

            startingNum++;
        }
    }
}

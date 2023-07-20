package homework.week2;

public class Q2_PrimeNumber { // 첫 50개의 소수 출력, 한줄에 10개 씩
    public static void main(String[] args) {
        final int MAX = 50;
        int count = 0;
        int startingNum = 2;

        while (count < MAX) {
            if (isPrime(startingNum)) {
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

    private static boolean isPrime(int startingNum) {
        //boolean isPrime = true;
        for (int divisor = 2; divisor < startingNum; divisor++) {
            if (startingNum % divisor == 0) {
                //isPrime = false;
                //break;
                return false;
            }
        }
//        return isPrime;
        return true;
    }
}

package grammer.week3;

public class G1_MethodOne {
    public static void main(String[] args) {
        // 자연수를 더하는 기능이 필요한데 만약에 메소드가 없다면 1 에서 10까지 더할때 또 20 부터 37까지 더할떄, 35에서 49까지 더할때 각자 다른 for 문을 불러와야 한다.

        sum(1, 10);

        sum(20, 37);

    }
    // 원래 1에서 10까지 더하고 20부터 37까지 더하고 또 35에서 49까지 더할려면 for문을 3번 해야한다.

    public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i1 < i2; i1++) {
            sum += i1;
        }

        return sum;
    }
}


package grammer.week3;

public class G3_MethodThree {
    // Passing Arguments by Values

    // The arguments are passed by value to parameters when invoking a method
    // 아규먼트로 파라미터를 넘겨줄 때는 순서대로 넘겨줘야 한다.
    public static void main(String[] args) {
        // parameter 순서 예제 
        nPrintln("Helo", 5);
        
        // Pass by value 예제
        
        int num1 = 1; 
        int num2 = 2;

        System.out.println("num1 = " + num1 + " num2 = " + num2);
        
        swap(num1, num2);

        System.out.println("num1 = " + num1  + " num2 = " + num2);

        
        
    }
    
    public static void swap(int a, int b) {
        System.out.println("Before swap (a, b) = " + a + " " + b);
        
        int temp = a;
        
        a = b;
        
        b = temp;

        System.out.println("After swap (a, b) = " + a + " " + b);
        
    }

    static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}

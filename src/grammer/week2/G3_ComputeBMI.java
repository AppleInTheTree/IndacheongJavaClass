package grammer.week2;
import java.util.Scanner;
public class G3_ComputeBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in height: ");
        double height  = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI is " + bmi);


        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}

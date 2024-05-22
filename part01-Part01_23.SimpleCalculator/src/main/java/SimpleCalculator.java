
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = firstNumber + secondNumber;
        int subtration = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double divison = 1.0 * firstNumber / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum ); 
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtration ); 
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication ); 
        System.out.println(firstNumber + " / " + secondNumber + " = " + divison ); 


        // Write your program here

    }
}

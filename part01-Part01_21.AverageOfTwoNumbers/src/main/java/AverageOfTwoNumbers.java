
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int integer2 = Integer.valueOf(scanner.nextLine());
        double sum = integer + integer2 ;
        double result = sum / 2;
        System.out.println("The average is " + result);
        

        // Write your program here

    }
}

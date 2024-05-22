
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int integer2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int integer3 = Integer.valueOf(scanner.nextLine());
        int sum = integer + integer2 + integer3;
        System.out.println("The sum of the numbers is " + sum);

        // Write your program here

    }
}

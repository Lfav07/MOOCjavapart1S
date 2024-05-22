
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int integer2 = Integer.valueOf(scanner.nextLine());
        int sum = integer + integer2;
        System.out.println(integer + " + " + integer2 + " = " + sum) ;

        // write your program here

    }
}

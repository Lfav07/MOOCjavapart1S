
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int ones = 0;
        while (true) {
            System.out.println("Give a number: ");

            int positives = Integer.valueOf(scanner.nextLine());

            if (positives == 0) {
                System.out.println("Sum of the numbers: " + ones);

                break;
            }
            if (positives != 0) {

                ones = ones + positives;
                continue;
            }

            System.out.println("Number of negative numbers: " + ones);

        }

    }
}

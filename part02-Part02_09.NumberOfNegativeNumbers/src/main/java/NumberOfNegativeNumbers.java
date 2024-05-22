
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;
        while (true) {
            System.out.println("Give a number: ");

            int negatives = Integer.valueOf(scanner.nextLine());

            if (negatives == 0) {
                break;
            }
            if (negatives > 0) {
                continue;
            }

            if (negatives < 0) {
                ones = ones + 1;
            }
        }

        System.out.println("Number of negative numbers: " + ones);

    }
}

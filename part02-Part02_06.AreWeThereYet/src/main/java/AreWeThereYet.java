
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number: ");
            String number = scanner.nextLine();
            if (number.equals("4")) {
                break;
            }

        }
    }
}
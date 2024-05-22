
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "temp";
        String[] parts = input.split(" ");
        while (true) {
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            parts = input.split(" ");
            System.out.println(parts[parts.length - 1]);
        }
    }
}

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        for (int count = 0; count < input + 1; count++) {
            System.out.println(count);
        }
    }
}


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastnumber = Integer.valueOf(scanner.nextLine());
        long count = 1;
        for (int i = 2; i <= lastnumber; i++) {
            count = count * i;
        }
        System.out.println(count);

    }
}

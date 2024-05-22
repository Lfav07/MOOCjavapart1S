
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String num = scanner.nextLine();
            if (num.equals("end")) {
                System.out.println();
                break;
            }
            int temp = Integer.valueOf(num);
            // Calculating the cube of the number
            int cube = (int) Math.pow(temp, 3);

            System.out.println(cube);

        }
    }
}

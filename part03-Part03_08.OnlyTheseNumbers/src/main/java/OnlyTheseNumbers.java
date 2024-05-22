
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where?");
        int fromwhere = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int towhere = Integer.valueOf(scanner.nextLine());
        int fromwhere2 = numbers.get(fromwhere);
        int towhere2 = numbers.get(towhere);
        System.out.println(fromwhere2);
        System.out.println(towhere2);

    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println(list.get(0));
        int index = list.size() - 1;
        while (index != list.size()) {
            String number = list.get(index);
            System.out.println(number);
            break;

        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

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
        System.out.println("Search for? ");
        String input = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            String number = list.get(i);
            if (input.equals(number)) {
                System.out.println(input + " was found!");
                found = true;
            }
        }

        if (!found) {
            System.out.println(input + " was not found!");
        }
    }
}

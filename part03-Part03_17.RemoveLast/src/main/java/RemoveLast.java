
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
        // Try your method in here
    }

    public static void removeLast(ArrayList<String> strings) {
        int index = strings.size() - 1;
        while (index != strings.size()) {
            if (strings.size() == 0) {
                break;
            }
            String number = strings.get(index);
            strings.remove(number);

        }

    }
}
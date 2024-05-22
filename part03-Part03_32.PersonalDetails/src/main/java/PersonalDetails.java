
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int totalBirthYears = 0;
        int personCount = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid input format. Please enter name and birth year separated by comma.");
                continue;
            }

            String name = parts[0].trim();
            int birthYear;
            try {
                birthYear = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid birth year format. Please enter a valid integer birth year.");
                continue;
            }

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            totalBirthYears += birthYear;
            personCount++;
        }

        if (personCount == 0) {
            System.out.println("No valid persons were provided.");
        } else {
            double averageBirthYear = (double) totalBirthYears / personCount;
            System.out.println("Longest name: " + longestName);
            System.out.println("Average birth year: " + averageBirthYear);
        }
    }
}
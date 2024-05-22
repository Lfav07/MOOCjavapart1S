import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = Integer.MIN_VALUE;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid input format. Please enter name and age separated by comma.");
                continue;
            }

            String name = parts[0].trim();
            int age;
            try {
                age = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format. Please enter a valid integer age.");
                continue;
            }

            if (age > maxAge) {
                maxAge = age;
            }
        }

        if (maxAge == Integer.MIN_VALUE) {
            System.out.println("No valid ages were provided.");
        } else {
            System.out.println("The oldest person's age is: " + maxAge);
        }
    }
}

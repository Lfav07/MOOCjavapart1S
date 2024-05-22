import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap:");
        int swap1 = Integer.valueOf(scanner.nextLine());
        int swap2 = Integer.valueOf(scanner.nextLine());

        if (swap1 >= 0 && swap1 < array.length && swap2 >= 0 && swap2 < array.length) {
            // Swap the elements
            int temp = array[swap1];
            array[swap1] = array[swap2];
            array[swap2] = temp;

            System.out.println("");
            index = 0;
            while (index < array.length) {
                System.out.println(array[index]);
                index++;
            }
        }
    }
}

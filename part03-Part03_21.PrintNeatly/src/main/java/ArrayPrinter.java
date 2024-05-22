
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int sum = 0; // Initialize sum to 0
        for (int i = 0; i < array.length; i++) {
            sum = array[i]; // Add each element to sum
            System.out.print(sum);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
            // Write some code in here
        }
    }
}

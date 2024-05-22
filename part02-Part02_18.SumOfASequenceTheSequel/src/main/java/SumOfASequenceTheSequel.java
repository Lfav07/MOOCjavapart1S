
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int firstnumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastnumber = Integer.valueOf(scanner.nextLine());
        int count = 0;

        while (firstnumber <= lastnumber) {

            count += firstnumber;

            firstnumber++;

       }
        System.out.println("The sum is " + count);

    }
}

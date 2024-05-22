
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
        printFromNumberToOne(2);

    }

    public static void printFromNumberToOne(int number) {
        for (int i = 0; number > i; number--) {
            System.out.println(number);
        }
    }
}

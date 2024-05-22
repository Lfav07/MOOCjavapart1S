public class Multiplier {
    private int multiply1;

    public Multiplier(int number) {
        this.multiply1 = number;
    }

    public int multiply(int number) {
        number = number * multiply1;
        return number;
    }
}

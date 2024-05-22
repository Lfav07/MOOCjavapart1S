public class Gauge {
    private int value;

    public void increase() {
        if (value < 5) {
            this.value++;

        }

    }

    public void decrease() {
        for (int i = 5; i < 0; i--) {
            this.value--;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}


import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        boolean isEmpty = false;

        if (this.stack.size() == 0) {
            isEmpty = true;

        }

        return isEmpty;
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {

        return this.stack;
    }

    public String take() {
        return this.stack.remove(this.stack.size() - 1);
    }

}

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (meals.contains(meal)) {

        } else {
            meals.add(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }

    public void printMeals() {
        for (int i = 0; i < meals.size(); i++) {
            System.out.println();
            System.out.println(meals.get(i));

        }
    }
}

// implement the required methods here

package Menu;

import java.util.HashMap;

public class Meal {
    private static int mealId;
    private HashMap<Integer, MealItem> mealItems = new HashMap<>();

    public Meal() {
        this.mealId ++;
    }

    public boolean addMealItem(MealItem mealItem)
    {
        this.mealItems.put(mealItem.getMealItemId(), mealItem);
        return true;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealId=" + mealId +
                ", mealItems=" + mealItems +
                '}';
    }
}

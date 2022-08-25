package Menu;

public class MealItem {
    private static int mealItemId;
    private int quantity;

    public MealItem(int quantity) {
        this.mealItemId ++;
        this.quantity = quantity;
    }

    public boolean updateQuantity(int quantity)
    {
        this.quantity = quantity;
        return true;
    }

    public int getMealItemId() {
        return mealItemId;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MealItem{" +
                "mealItemId=" + mealItemId +
                ", quantity=" + quantity +
                '}';
    }
}

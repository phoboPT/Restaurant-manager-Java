package Menu;

import java.util.HashMap;

public class MenuItem {
    private static int menuItemId;
    private String title;
    private String description;
    private double price;
    private HashMap<Integer,MealItem> mealItem = new HashMap<>();

    public MenuItem( String title, String description, double price) {
        this.menuItemId ++;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getMenuItemId() {
        return menuItemId;
    }
    public boolean addMealItem(MealItem mealItem)
    {
        this.mealItem.put(mealItem.getMealItemId(), mealItem);
        return true;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemId=" + menuItemId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", mealItem=" + mealItem +
                '}';
    }
}

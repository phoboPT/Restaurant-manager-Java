package Menu;

import java.util.HashMap;

public class MenuSection {
    private static int menuSectionId;
    private String title;
    private String description;
    private HashMap<Integer, MenuItem> menuItems = new HashMap<>();

    public MenuSection( String title, String description) {
        this.menuSectionId ++;
        this.title = title;
        this.description = description;
    }

    public int getMenuSectionId() {
        return menuSectionId;
    }



    public String getTitle() {
        return title;
    }

    public HashMap<Integer, MenuItem> getMenuItems() {
        return menuItems;
    }

    public boolean addMenuItem(MenuItem menuItems) {
        this.menuItems.put(menuItems.getMenuItemId(), menuItems);
        return true;
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

    @Override
    public String toString() {
        return "MenuSection{" +
                "menuSectionId=" + menuSectionId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}

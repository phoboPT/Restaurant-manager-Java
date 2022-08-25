package Menu;

import java.util.HashMap;

public class Menu {
    private static int menuId;
    private String title;
    private String description;

    private HashMap<Integer, MenuSection> menuSections = new HashMap<>();

    public Menu( String title, String description) {
        this.menuId ++;
        this.title = title;
        this.description = description;
    }

    public boolean addMenuSection(MenuSection menuSection)
    {
        this.menuSections.put(menuSection.getMenuSectionId(), menuSection);
        return true;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", menuSections=" + menuSections +
                '}';
    }
}

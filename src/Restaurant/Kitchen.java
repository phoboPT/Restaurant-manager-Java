package Restaurant;

import Employee.Chef;

import java.util.HashMap;

public class Kitchen {
    private String name;
    private HashMap<String,Chef> chefs= new HashMap();
    public Kitchen(String name) {
        this.name = name;
    }
    public boolean assignChef(Chef chef)
    {
        chefs.put(chef.getName(),chef);
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "name='" + name + '\'' +
                ", chefs=" + chefs +
                '}';
    }
}

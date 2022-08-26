package Restaurant;

import Entity.Adress;
import Entity.Employee;
import Menu.Menu;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

public class Branch implements Serializable {
    private String name;
    private Adress location;
    private Kitchen kitchen;
    private HashMap<Integer, TableChart> tableCharts = new HashMap();
    private HashMap<Integer, Employee> employees = new HashMap();
    private Menu menu;

    public Branch(String name, Adress location) {
        this.name = name;
        this.location = location;

    }

    public Collection<Employee> getEmployees() {
        return employees.values();
    }

    public void setEmployees(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(String title, String description) {
        this.menu = new Menu(title, description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public HashMap<Integer, TableChart> getTableCharts() {
        return tableCharts;
    }

    public boolean addTableChart(TableChart tableChart) {
        this.tableCharts.put(tableChart.getTabbleChartId(), tableChart);
        return true;
    }

    public Adress getLocation() {
        return location;
    }

    public void setLocation(Adress location) {
        this.location = location;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public String toString() {
        return "Branch{" + "name='" + name + '\'' + ", location=" + location + ", kitchen=" + kitchen + ", tableCharts=" + tableCharts + ", menu=" + menu + '}';
    }


}

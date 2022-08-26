package Restaurant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Restaurant implements Serializable {
    private String name;
    private HashMap<String,Branch> branches= new HashMap();

    public Restaurant(String name) {
        this.name = name;
    }
    public Restaurant() {

    }

    public boolean addBranch(Branch branch) {
        branches.put(branch.getName(),branch);
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch(String name) {
        return branches.get(name);
    }




    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", branches=" + branches.toString() +
                '}';
    }

    public Collection<Branch> getBranches() {
        return branches.values();
    }

    public void getEmployees() {
    }
}

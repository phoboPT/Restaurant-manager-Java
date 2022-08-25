package Employee;

import Entity.Employee;

import java.util.Date;

public class Manager extends Employee {
    public Manager(Date dateJoined, Account account, String name, String phoneNumber, String email) {
        super(dateJoined, account, name, phoneNumber, email);
    }

    public boolean addEmployee(Employee employee) {
        return true;
    }

    public String toString() {
        return (super.toString());
    }
}

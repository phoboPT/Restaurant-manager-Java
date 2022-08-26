package Entity;

import Employee.Account;

import java.io.Serializable;
import java.util.Date;

public abstract class Employee extends Person implements Serializable {
    private static int employeeId = 0;
    private Date dateJoined;
    private Account account;

    public Employee(Date dateJoined, Account account, String name, String phoneNumber, String email) {
        super(name, email, phoneNumber);

        this.employeeId++;
        this.dateJoined = dateJoined;
        this.account = account;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(int employeeId) {
        Employee.employeeId = employeeId;
    }

    public String getName() {
        return super.getName();
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return super.toString() + " \n" +
                "Employee{" + "employeeId=" + employeeId +
                ", dateJoined=" + dateJoined +
                ", account=" + account + '}';
    }
}

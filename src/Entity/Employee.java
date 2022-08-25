package Entity;

import Employee.Account;

import java.util.Date;

public abstract class Employee extends Person {
    private static int employeeId=0;
    private Date dateJoined;
    private Account account;

    public Employee( Date dateJoined, Account account, String name, String phoneNumber, String email) {
        super(name, email, phoneNumber);

        this.employeeId++;
        this.dateJoined = dateJoined;
        this.account = account;
    }

    public int getEmployeeId() {
        return employeeId;
    }



    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }


    @Override
    public String toString() {
        return super.toString() + " \n" +
                "Employee{" + "employeeId=" + employeeId +
                ", dateJoined=" + dateJoined +
                ", account=" + account + '}';
    }
}

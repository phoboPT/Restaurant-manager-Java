package Employee;

import Entity.Employee;

import java.util.Date;

public class Receptionist extends Employee {


    public Receptionist( Date dateJoined, Account account, String name, String phoneNumber, String email) {
        super( dateJoined, account, name, phoneNumber, email);
    }

    public boolean createReservation() {
        return true;
    }

    public String toString() {
        return (super.toString());
    }

}

package Employee;

import Entity.Employee;

import java.io.Serializable;
import java.util.Date;

public class Chef extends Employee implements Serializable {

    public Chef(Date dateJoined, Account account, String name, String phoneNumber, String email) {
        super(dateJoined, account, name, phoneNumber, email);
    }

    public boolean takeOrder() {
        return true;
    }


    public String toString() {
        return (super.toString());
    }
}

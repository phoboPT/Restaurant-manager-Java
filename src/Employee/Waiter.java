package Employee;

import Entity.Employee;

import java.util.Date;

public class Waiter extends Employee {



    public Waiter( Date dateJoined, Account account, String name, String phoneNumber, String email) {
        super( dateJoined, account, name, phoneNumber, email);

    }

    public boolean createOrder() {
        return true;
    }
    public String toString(){
        return (super.toString());
    }
}

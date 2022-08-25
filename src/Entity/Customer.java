package Entity;

import java.util.Date;

public class Customer extends Person {
    private Date lastVisited;

    public Customer(Date lastVisited, String name, String email, String phoneNumber) {
        super( name, email, phoneNumber);
        this.lastVisited = lastVisited;
    }

    public Date getLastVisited() {
        return lastVisited;
    }

    public void setLastVisited(Date lastVisited) {
        this.lastVisited = lastVisited;
    }

    public String toString(){
       return (super.toString() + "\nLast visited: " + lastVisited);
    }
}


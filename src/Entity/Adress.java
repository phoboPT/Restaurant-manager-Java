package Entity;

import java.io.Serializable;

public class Adress implements Serializable {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Adress(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zip='" + zip + '\'' + '}';
    }
}

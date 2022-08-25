package Employee;

import Entity.Adress;
import Enum.AccountStatus;


public class Account {

    private static int id;
    private String password;
    private Adress adress;
    private AccountStatus status;

    public Account(String password, Adress adress, AccountStatus status) {
        this.id++;
        this.password = password;
        this.adress = adress;
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" + "id='" + id + '\'' + ", password='" + password + '\'' + ", adress=" + adress + ", status=" + status + '}';
    }
}

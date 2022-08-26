package Employee;

import Entity.Adress;
import Enum.AccountStatus;

import java.io.Serializable;


public class Account implements Serializable {

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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Account.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" + "id='" + id + '\'' + ", password='" + password + '\'' + ", adress=" + adress + ", status=" + status + '}';
    }
}

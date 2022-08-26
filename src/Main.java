import Employee.Account;
import Employee.Chef;
import Entity.Adress;
import Entity.Employee;
import Enum.AccountStatus;
import Restaurant.Branch;
import Restaurant.Kitchen;
import Restaurant.Restaurant;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;


public class Main {
    static Restaurant restaurant;

    public static void main(String[] args) {
        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.bin"));
            restaurant = (Restaurant) in.readObject();

            System.out.println(restaurant.getName() + " " + restaurant.getBranches());

            in.close();

        } catch (Exception e) {
            System.out.println(e);
            if(restaurant==null){
                System.out.println("Restaurant name: ");
                restaurant = new Restaurant(readString());
            }
        }

        boolean exit = false;
        while (exit == false) {
//            System.out.println("username: ");
//            String username = readString();
//            System.out.println("password: ");
//            String password = readString();
//            System.out.println("Branch: ");
//            String branchName = readString();
//
//            Collection<Employee> employees = restaurant.getBranch(branchName).getEmployees();
//            if(employees.isEmpty()){
//                System.out.println("No employees in this branch");
//                break;
//            }
//            var employee = employees.stream().filter(e -> e.getName().equals(username) && e.getAccount().getPassword().equals(password)).findFirst();
//            System.out.println(employee);
            switch (menu()) {
                case 9:
                    adminMenu();
                    break;
                case 0:
                    try {

                        FileOutputStream fout = new FileOutputStream("save.bin");
                        ObjectOutputStream out = new ObjectOutputStream(fout);
                        out.writeObject(restaurant);
                        out.flush();
                        //closing the stream
                        out.close();
                        System.out.println("success");
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }

    public final static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int menu() {
        clearConsole();
        System.out.println("----------Menu----------");

        System.out.println("9 - Admin");
        System.out.println("0 - Exit");

        return readInt();
    }

    private static void adminMenu() {
        clearConsole();
        System.out.println("----------Admin Menu----------");
        System.out.println("1 - Add Branch");
        System.out.println("2 - Add Kitchen");
        System.out.println("3 - Add Chef");
        System.out.println("0 - Go Back");

        switch (readInt()) {
            case 1: {
                System.out.println("Enter branch name: ");
                String branchName = readString();

                Adress adress = createAddress();
                restaurant.addBranch(new Branch(branchName, adress));
                System.out.println(restaurant);
                break;
            }
            case 2: {
                Branch selectedBranch = selectBranch();
                if (selectedBranch == null) {
                    System.out.println("Branch not found");
                    break;
                }
                System.out.println("Enter kitchen name: ");
                selectedBranch.setKitchen(new Kitchen(readString()));
                System.out.println(restaurant);
                break;
            }
            case 3: {
                Branch selectedBranch = selectBranch();
                if (selectedBranch == null) {
                    System.out.println("Branch not found");
                    break;
                }
                System.out.println("Enter chef name: ");
                String chefName = readString();
                Adress adress = createAddress();
                Account account = createAccount(adress);
                System.out.println("Enter phone number: ");
                String phoneNumber = readString();
                System.out.println("Enter email: ");
                String email = readString();
                Chef chef = new Chef(new Date(), account, chefName, phoneNumber, email);
                selectedBranch.getKitchen().assignChef(chef);
                System.out.println(restaurant);
            }
        }
    }

    @Contract("_ -> new")
    private static @NotNull Account createAccount(Adress adress) {
        System.out.println("Enter password: ");
        String password = readString();
        return new Account(password, adress, AccountStatus.ACTIVE);
    }

    private static int readInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static String readString() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static @Nullable Branch selectBranch() {
        Collection<Branch> branches = restaurant.getBranches();
        if (branches.size() == 0) {
            System.out.println("No branches added");
            return null;
        }
        branches.forEach(branch -> System.out.println(branch.getName()));
        System.out.println("Select branch: ");
        String selectedBranchName = readString();
        Branch selectedBranch = restaurant.getBranch(selectedBranchName);
        return selectedBranch;
    }


    @Contract(" -> new")
    private static @NotNull Adress createAddress() {
        System.out.println("Enter street: ");
        String street = readString();
        System.out.println("Enter city: ");
        String city = readString();
        System.out.println("Enter state: ");
        String state = readString();
        System.out.println("Enter postcode: ");
        String postcode = readString();
        return new Adress(street, city, state, postcode);
    }


}

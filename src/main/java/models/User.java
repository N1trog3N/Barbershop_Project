package models;
import patterns.Visitor;

import java.util.ListResourceBundle;

public class User {
    private static int nextUserID = 1;

    private int userID;
    private String username;
    private String password;
    private boolean isAdmin;
    private boolean isBarber;

    public User(String username, String password, boolean isAdmin, boolean isBarber) {
        this.userID = nextUserID++;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isBarber = isBarber;
    }

    public final boolean login(String enteredPassword) {
        if (password.equals(enteredPassword)) {
            System.out.println(username + " logged in successfully.");
            return true;
        } else {
            System.out.println("Incorrect password for user " + username + ".");
            return false;
        }
    }

    public int getID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public final void register() {
        System.out.println(username + " registered successfully.");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void getFunctionality() {
        System.out.println("Basic User Functionality");
    }

}

package main.user;

import main.property.Property;

import java.util.List;

public class GuestUser {
    protected int activeTime;
    protected String sessionID;

    public List<Property> findProperty(Object criteria){
        //Implement this Method
        return null;
    }

    public RegisteredUser registerUser(String username, String password, String email){
        //Implement this Method
        return null;
    }

    public void loginUser(String username, String password) {
        //Implement this Method
    };
}

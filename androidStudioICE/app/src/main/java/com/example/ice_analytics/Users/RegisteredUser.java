package com.example.ice_analytics.Users;

public class RegisteredUser extends User{

    public RegisteredUser(){
        // empty constructor for firebase db //
    }

    public RegisteredUser (String fName, String lName, String username, String email, String password, String phoneNumber, String type){
        super(fName, lName, username, password, email, phoneNumber, "Registered");
    }
}

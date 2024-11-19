package com.example.ice_analytics.Users;

public class UnregisteredUser extends User{

    public UnregisteredUser(){
        // empty constructor for firebase db //
    }

    public UnregisteredUser(String fName, String lName, String username, String email, String password, String phoneNumber, String type){
        super(fName, lName, username, password, email, phoneNumber, "Pending");
    }
}


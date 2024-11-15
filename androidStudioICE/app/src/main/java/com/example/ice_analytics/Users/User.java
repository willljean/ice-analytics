package com.example.ice_analytics.Users;


public class User {
    String fName;
    String lName;
    String username;
    String password;
    String email;
    String phoneNumber;
    String type;


    public User() {
        // empty constructor for firebase db //
    }


    public User(String fName, String lName, String username, String password, String email, String phoneNumber, String type) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

// GETTERS START //
    public String getfName() {return fName;}

    public String getlName() {return lName;}

    public String getUsername() {return username;}

    public String getEmail() {return email;}

    public String getPassword() {return password;}

    public String getPhoneNumber() {return phoneNumber;}

    public String getType() {return type;}

// GETTERS END //

// SETTER START //

    public void setfName(String fName) {this.fName = fName;}

    public void setlName(String lName) {this.lName = lName;}

    public void setEmail(String email) {this.email = email;}

    public void setPassword(String password) {this.password = password;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public void setType(String type) {this.type = type;}

    public void setUsername(String username) {this.username = username;}

// SETTERS END //


    // login validation //
    public boolean login() {
        return this.password == password;
    }


}
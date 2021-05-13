package com.company;

public class User {

    private String password;
    private String defaultPassword = "0000";

    public User() {
    }

    public User(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }
}


package com.example;

public class Laptop {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Create a new constructor
    public Laptop() {
        System.out.println("object Created");
    }

    public void code() {
        System.out.println("compling...");
    }
}

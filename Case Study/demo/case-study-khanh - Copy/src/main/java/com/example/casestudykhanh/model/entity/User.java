package com.example.casestudykhanh.model.entity;

import java.rmi.registry.Registry;

public class User {
    private static int id=0;
    private String fullname;
    private String address;
    private String phoneNumber;
    private String username;
    private String password;

    public User(String fullname, String address, String phoneNumber, String username, String password) {
        this.fullname = fullname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        ++id;
    }

    public static int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

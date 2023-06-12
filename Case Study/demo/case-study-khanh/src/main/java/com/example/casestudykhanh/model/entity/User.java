package com.example.casestudykhanh.model.entity;

import java.rmi.registry.Registry;

public class User {
    private String id;
    private String fullname;
    private String email;
    private String password;
    private String gender;

    public User() {
    }

    public User(String id, String fullname, String email, String password, String gender) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public User(String fullname, String email, String password, String gender) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

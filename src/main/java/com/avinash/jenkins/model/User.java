package com.avinash.jenkins.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Users")

public class User {
    @Id
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    //Constructor
    public User(String fn,String ln,String un,String pass,String email){
        this.firstname = fn;
        this.lastname = ln;
        this.username = un;
        this.password = pass;
        this.email = email;
    }

    public User() {};

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    @Override
    public String toString() {
        return "User{" +
                "username=" + this.username +
                ", firstName='" + this.firstname + '\'' +
                ", lastName='" + this.lastname + '\'' +
                ", email='" + this.email + '\'' +
                ", password='" + this.password + '\'' +
                '}';
    }
}

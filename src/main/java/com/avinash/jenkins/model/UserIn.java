package com.avinash.jenkins.model;

public class UserIn {
    private String username;
    private String password;

    public  UserIn() {};

    public UserIn(String un,String pw){
        this.username = un;
        this.password = pw;
    }

    //setters
    public void setUsername(String un){
        this.username = un;
    }

    public void setPassword(String pw){
        this.password = pw;
    }

    //getters
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}

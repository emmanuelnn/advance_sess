package com.example.signin;
public class User {

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    private String fullname;
    private String address;
    private String password;
    private String EmailAddress;

    public User(String f, String a, String p, String e){
        this.fullname = f;
        this.EmailAddress = e;
        this.password = p;
        this.address = a;
    }

    public User(){
    }









}
package com.bridgelabz.dbconnection;

//A basic pojo has been designed with all the basic details with constructor,getter and setters.
public class UserInfo {
    private String firstName, lastName,emailID,contact,pswd;

    public UserInfo() {
    }

    public UserInfo(String firstName, String lastName, String emailID, String contact, String pswd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.contact = contact;
        this.pswd = pswd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}

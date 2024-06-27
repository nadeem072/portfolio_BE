package com.example.spring1.profile;

import org.springframework.stereotype.Component;

@Component
public class Basic {

    private String firstName;
    private String LastName;
    private String fullName;
    private String email;
    private String contact;
    private String description;

    //constructor
    public Basic(String firstName,
                 String lastName,
                 String fullName,
                 String email,
                 String contact,
                 String description) {

        this.firstName = firstName;
        LastName = lastName;
        this.fullName = fullName;
        this.email = email;
        this.contact = contact;
        this.description = description;
    }

    public Basic() {
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

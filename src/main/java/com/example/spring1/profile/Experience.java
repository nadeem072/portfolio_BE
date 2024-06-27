package com.example.spring1.profile;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Experience {
    private String nameOfOrg;
    private String designation;
    private LocalDate dateOfJoining;
    private LocalDate dateOfRelieving;

    //constructor

    public Experience(String nameOfOrg,
                      String designation,
                      LocalDate dateOfJoining,
                      LocalDate dateOfRelieving) {
        this.nameOfOrg = nameOfOrg;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.dateOfRelieving = dateOfRelieving;
    }

    public Experience() {
    }
    //getters and setters

    public String getNameOfOrg() {
        return nameOfOrg;
    }

    public void setNameOfOrg(String nameOfOrg) {
        this.nameOfOrg = nameOfOrg;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public LocalDate getDateOfRelieving() {
        return dateOfRelieving;
    }

    public void setDateOfRelieving(LocalDate dateOfRelieving) {
        this.dateOfRelieving = dateOfRelieving;
    }
}

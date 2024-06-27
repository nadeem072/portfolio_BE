package com.example.spring1.profile;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Certifications {
    private String nameOfTheCertification;
    private String numberOfCertificate;
    private LocalDate dateOfIssue;
    private String nameOfIssuer;

    //constructor

    public Certifications(String nameOfTheCertification, String numberOfCertificate, LocalDate dateOfIssue, String nameOfIssuer) {
        this.nameOfTheCertification = nameOfTheCertification;
        this.numberOfCertificate = numberOfCertificate;
        this.dateOfIssue = dateOfIssue;
        this.nameOfIssuer = nameOfIssuer;
    }

    public Certifications() {
    }
    //getters and setters

    public String getNameOfTheCertification() {
        return nameOfTheCertification;
    }

    public void setNameOfTheCertification(String nameOfTheCertification) {
        this.nameOfTheCertification = nameOfTheCertification;
    }

    public String getNumberOfCertificate() {
        return numberOfCertificate;
    }

    public void setNumberOfCertificate(String numberOfCertificate) {
        this.numberOfCertificate = numberOfCertificate;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getNameOfIssuer() {
        return nameOfIssuer;
    }

    public void setNameOfIssuer(String nameOfIssuer) {
        this.nameOfIssuer = nameOfIssuer;
    }
}

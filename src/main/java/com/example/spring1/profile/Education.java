package com.example.spring1.profile;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Education {
    private String nameOfInstitution;
    private String nameOfCourse;
    private String specification;
    private LocalDate yearOfPassing;
    private String modeOfStudy;

    //Constructor

    public Education(String nameOfInstitution,
                     String nameOfCourse,
                     String specification,
                     LocalDate yearOfPassing,
                     String modeOfStudy) {
        this.nameOfInstitution = nameOfInstitution;
        this.nameOfCourse = nameOfCourse;
        this.specification = specification;
        this.yearOfPassing = yearOfPassing;
        this.modeOfStudy = modeOfStudy;
    }

    public Education() {
    }

    //getters and setters

    public String getNameOfInstitution() {
        return nameOfInstitution;
    }

    public void setNameOfInstitution(String nameOfInstitution) {
        this.nameOfInstitution = nameOfInstitution;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public LocalDate getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(LocalDate yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public String getModeOfStudy() {
        return modeOfStudy;
    }

    public void setModeOfStudy(String modeOfStudy) {
        this.modeOfStudy = modeOfStudy;
    }
}

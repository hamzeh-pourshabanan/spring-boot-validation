package com.example.springbootvalidation.model;

import jakarta.validation.constraints.NotBlank;

public class User {

    @NotBlank(message = "username cannot be empty")
    private String name;
    @NotBlank(message = "username cannot be empty")
    private String passwork;
    private Double grade;

    public User(String name, String passwork, Double grade) {
        this.name = name;
        this.passwork = passwork;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}

package com.example.springbootvalidation.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class User {

    @NotBlank(message = "username cannot be empty")
    private String name;
    @NotBlank(message = "password cannot be empty")
    @Length(min = 6, max = 10, message = "length of password should be between 6 to 10 characters")
    private String password;
    @Min(value = 0)
    @Max(value = 100 , message = "grade should not exceed 100")
    private Double grade;

    public User(String name, String passwork, Double grade) {
        this.name = name;
        this.password = passwork;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}

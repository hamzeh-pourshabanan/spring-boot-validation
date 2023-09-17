package com.example.springbootvalidation.controller;

import com.example.springbootvalidation.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
public class UserController {
    @RequestMapping("add")
    public String toAdd(User user) {
        return "add";
    }
}

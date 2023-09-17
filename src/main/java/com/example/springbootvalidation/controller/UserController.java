package com.example.springbootvalidation.controller;

import com.example.springbootvalidation.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
public class UserController {
    @RequestMapping("add")
    public String toAdd(User user) {
        return "add";
    }

    @RequestMapping("addUser")
    public String add(User user, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        System.out.println("Save user =" + user);
        return "success";
    }
}

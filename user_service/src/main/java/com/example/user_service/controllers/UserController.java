package com.example.user_service.controllers;

import com.example.user_service.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(){
        return new User(1,"khoi");
    }
}

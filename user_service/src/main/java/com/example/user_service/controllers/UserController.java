package com.example.user_service.controllers;

import com.example.user_service.models.Product;
import com.example.user_service.models.User;
import com.example.user_service.models.UserProduct;
import com.example.user_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/user-product")
    public UserProduct getUserProduct(){
        User user = new User(1,"khoi");
        Product product = userService.getProduct();
        return new UserProduct(user,product);
    }
}

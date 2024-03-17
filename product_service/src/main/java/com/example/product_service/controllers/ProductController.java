package com.example.product_service.controllers;

import com.example.product_service.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
    public Product getProduct(){
        return new Product(1,"Tivi Samsung",100.5);
    }
}

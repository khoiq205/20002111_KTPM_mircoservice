package com.example.user_service.services;

import com.example.user_service.models.Product;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    RestTemplate restTemplate = new RestTemplate();
    public Product getProduct(){
        String apiGetProduct = "http://localhost:8080/product";
        ResponseEntity<Product> responseEntity = restTemplate.exchange(
                apiGetProduct,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Product>() {}
        );
        return responseEntity.getBody();
    }
}

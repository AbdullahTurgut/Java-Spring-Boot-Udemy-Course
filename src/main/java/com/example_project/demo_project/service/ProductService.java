package com.example_project.demo_project.service;

import com.example_project.demo_project.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 110.5, "Some smart phones"),
            new Product(2L, "Iphone", 240.0, "Some iphones"),
            new Product(3L, "Sneaker", 150.0, "Some shoes"),
            new Product(4L, "Xhaomi", 70.5, "Some android phones"));

    
    public List<Product> getAllProducts() {
        return products;
    }
}

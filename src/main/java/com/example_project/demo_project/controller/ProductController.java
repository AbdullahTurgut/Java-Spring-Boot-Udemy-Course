package com.example_project.demo_project.controller;

import com.example_project.demo_project.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 110.5, "Some smart phones"),
            new Product(2L, "Iphone", 240.0, "Some iphones"),
            new Product(3L, "Sneaker", 150.0, "Some shoes"),
            new Product(4L, "Xhaomi", 70.5, "Some android phones"));

    // /api/v1/products/all -> bu url'de
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return products;
    }
}

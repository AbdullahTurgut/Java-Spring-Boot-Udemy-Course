package com.example_project.demo_project.controller;

import com.example_project.demo_project.model.Product;
import com.example_project.demo_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    // productservice
    private final ProductService productService;

    // @RequiredArgsConstructor bu annotation ile constructor yazmamıza gerek kalmadı
    /*
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    */
    // /api/v1/products/all -> bu url'de
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}

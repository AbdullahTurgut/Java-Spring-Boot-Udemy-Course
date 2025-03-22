package com.example_project.demo_project.service;

import com.example_project.demo_project.model.Product;
import com.example_project.demo_project.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    // Şimdi kendimiz bir veritabanı oluşturacağız.
    /*List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 110.5, "Some smart phones"),
            new Product(2L, "Iphone", 240.0, "Some iphones"),
            new Product(3L, "Sneaker", 150.0, "Some shoes"),
            new Product(4L, "Xhaomi", 70.5, "Some android phones"));*/
    /*private final List<Product> products = Arrays.asList(
            new Product(1L, "Samsung", 110.5, "Some smart phones"),
            new Product(2L, "Iphone", 240.0, "Some iphones"),
            new Product(3L, "Sneaker", 150.0, "Some shoes"),
            new Product(4L, "Laptop", 550.0, "Some laptops"),
            new Product(5L, "TV", 370.0, "Some TV's"),
            new Product(6L, "Xhaomi", 70.5, "Some android phones"));*/
    // service yapısı repository ile köprü olup fetch işlemleri yapar

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    // @PostConstruct
   /* public List<Product> saveProducts() {
        return productRepository.saveAll(products);
    }*/
}

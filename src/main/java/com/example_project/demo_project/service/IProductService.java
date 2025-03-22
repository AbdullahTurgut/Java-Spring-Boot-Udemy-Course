package com.example_project.demo_project.service;

import com.example_project.demo_project.model.Product;

import java.util.List;

public interface IProductService {

    // Add Update ve Delete işlemleri burada abstract olarak tanımlanacak

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long productId);

    List<Product> getAllProducts();

    Product getProductById(Long id);
}

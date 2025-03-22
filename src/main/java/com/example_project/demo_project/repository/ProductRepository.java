package com.example_project.demo_project.repository;

import com.example_project.demo_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}

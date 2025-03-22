package com.example_project.demo_project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// getter ve setterları Lombok dependency ile halledeceğiz.
//@Getter ve @Setter yazmak yerine "@Data" tek başına yeterli oluyor.
// constructor lar içinde annotation kullandık
// veritabanı bilgilerimizi bu product
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String description;
    private int quantity;
}

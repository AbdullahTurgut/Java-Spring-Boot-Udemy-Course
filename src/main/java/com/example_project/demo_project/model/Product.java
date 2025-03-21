package com.example_project.demo_project.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// getter ve setterları Lombok dependency ile halledeceğiz.
//@Getter ve @Setter yazmak yerine "@Data" tek başına yeterli oluyor.
// constructor lar içinde annotation kullandık
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private Double price;
    private String description;
}

package com.example_project.demo_project.controller;

import com.example_project.demo_project.model.Product;
import com.example_project.demo_project.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    // productservice
    private final IProductService iProductService;

    // @RequiredArgsConstructor bu annotation ile constructor yazmamıza gerek kalmadı
    /*
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    */
    // /api/v1/products/all -> bu url'de
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return iProductService.addProduct(product);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return iProductService.getAllProducts();
    }

    @GetMapping("/{id}/product")
    public Product getProductById(@PathVariable Long id) {
        return iProductService.getProductById(id);
    }

    @PutMapping("/update")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return iProductService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteProduct(@PathVariable Long productId) {
        iProductService.deleteProduct(productId);
    }
}

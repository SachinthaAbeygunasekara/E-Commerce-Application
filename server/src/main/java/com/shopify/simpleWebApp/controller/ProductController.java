package com.shopify.simpleWebApp.controller;

import com.shopify.simpleWebApp.model.Product;
import com.shopify.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductsById(@PathVariable int id){
        return productService.getProductsById(id);
    }

    @PostMapping("/add")
    public void addProducts(@RequestBody  Product product){
        System.out.println("Adding.........");
        productService.addProduct(product);
    }

}

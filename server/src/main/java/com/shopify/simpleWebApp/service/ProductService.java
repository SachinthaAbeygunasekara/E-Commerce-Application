package com.shopify.simpleWebApp.service;

import com.shopify.simpleWebApp.model.Product;
import com.shopify.simpleWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    List<Product> products = new ArrayList<Product>(List.of(new Product(101,"Iphone",50000), new Product(102,"Canon",100000),new Product(103,"Msi laptop",500000)));

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductsById(int prodId) {
        return productRepository.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int ProductId) {
        productRepository.deleteById(ProductId);
    }
}


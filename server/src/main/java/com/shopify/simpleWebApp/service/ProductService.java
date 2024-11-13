package com.shopify.simpleWebApp.service;

import com.shopify.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<Product>(List.of(new Product(101,"Iphone",50000), new Product(102,"Canon",100000),new Product(103,"Msi laptop",500000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductsById(int prodId) {
        return products.stream().filter(p-> p.getProdId() == prodId).findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

package com.shopify.simpleWebApp.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int price;
}

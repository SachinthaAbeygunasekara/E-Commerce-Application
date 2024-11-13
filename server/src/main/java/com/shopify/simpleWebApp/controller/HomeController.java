package com.shopify.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Shopify";
    }

    @RequestMapping("/about")
    public String about(){
        return "We are selling products";
    }
}
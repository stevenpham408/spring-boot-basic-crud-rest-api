package com.phamst2learning.springbootrestapi.controller;

public class ProductNotFoundException extends RuntimeException {
    ProductNotFoundException(int id){
        super("Could not find the product with the id " + id);
    }

    ProductNotFoundException(String name){
        super("Could not find the product with the name " + name);
    }
}

package com.phamst2learning.springbootrestapi.controller;

import com.phamst2learning.springbootrestapi.entity.Product;
import com.phamst2learning.springbootrestapi.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addMultipleProducts(@RequestBody List<Product> productList){
        return service.saveListProduct(productList);
    }



}

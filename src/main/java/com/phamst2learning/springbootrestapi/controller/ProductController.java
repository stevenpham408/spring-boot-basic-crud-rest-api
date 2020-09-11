package com.phamst2learning.springbootrestapi.controller;

import com.phamst2learning.springbootrestapi.entity.Product;
import com.phamst2learning.springbootrestapi.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteProduct(@PathVariable int id){
        return service.deleteProductById(id);
    }
}

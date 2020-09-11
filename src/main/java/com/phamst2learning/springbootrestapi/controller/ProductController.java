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

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        Product toBeFound = service.getProductById(id);
        if(toBeFound == null){
            throw new ProductNotFoundException(id);
        }
        return service.getProductById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name){
        Product toBeFound = service.getProductByName(name);
        if(toBeFound == null){
            throw new ProductNotFoundException(name);
        }
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        Product toBeFound = service.getProductById(product.getId());
        if(toBeFound == null){
            throw new ProductNotFoundException(product.getId());
        }
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteProduct(@PathVariable int id){
        Product toBeFound = service.getProductById(id);
        if(toBeFound == null){
            throw new ProductNotFoundException(id);
        }
        return service.deleteProductById(id);
    }
}

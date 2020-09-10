package com.phamst2learning.springbootrestapi.service;

import com.phamst2learning.springbootrestapi.entity.Product;
import com.phamst2learning.springbootrestapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveListProduct(List<Product> products){
        return repository.saveAll(products);
    }
}

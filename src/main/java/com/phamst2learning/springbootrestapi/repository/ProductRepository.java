package com.phamst2learning.springbootrestapi.repository;

import com.phamst2learning.springbootrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}

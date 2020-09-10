package com.phamst2learning.springbootrestapi.service;

import com.phamst2learning.springbootrestapi.entity.Product;
import com.phamst2learning.springbootrestapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sun.font.TrueTypeGlyphMapper;

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

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public boolean deleteProductById(int id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            System.out.println("Deleted product " + id);
            return true;
        }

        return false;
    }

    public Product updateProduct(Product product){
        Product storedProduct = repository.findById(product.getId()).orElse(null);
        if(storedProduct != null){
            storedProduct.setName(product.getName());
            storedProduct.setPrice(product.getPrice());
            storedProduct.setQuantity(product.getQuantity());
        }
        return repository.save(storedProduct);
    }

}

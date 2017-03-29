package com.adil.services;

import com.adil.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.ProductRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product findById(long id) {
        return productRepository.findOne(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.saveAndFlush(product);
    }

    public Product update(Product product) {
        return save(product);
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }

    public void delete(long id) {
        productRepository.delete(id);
    }
}

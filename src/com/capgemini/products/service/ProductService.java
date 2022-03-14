package com.capgemini.products.service;

import com.capgemini.products.entity.Product;
import com.capgemini.products.repository.ProductRepository;

import java.util.List;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();

    public List<Product> getAllProducts() {
        return productRepository.read();
    }
}

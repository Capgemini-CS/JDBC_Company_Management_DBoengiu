package com.capgemini.products.service;

import com.capgemini.exceptions.ProductCodeInvalidFormat;
import com.capgemini.products.entity.Product;
import com.capgemini.products.repository.ProductRepository;
import org.tinylog.Logger;

import java.util.List;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();

    public List<Product> getAllProducts() {
        return productRepository.readAllValues();
    }

    public Product getProductByProductCode(String productCode) {
        checkProductCode(productCode);
        return productRepository.readValuesByProductCode(productCode);
    }

    private void checkProductCode(String productCode) {
        if (!productCode.matches("[S]\\d{2}_\\d{4}")){
            Logger.error(() -> new ProductCodeInvalidFormat("You entered an invalid format for product code"));
            throw new ProductCodeInvalidFormat("You entered an invalid format for product code");
        }
    }
}

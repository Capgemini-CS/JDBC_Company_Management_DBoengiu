package com.capgemini.service;

import com.capgemini.exceptions.InvalidFormat;
import com.capgemini.entity.Product;
import com.capgemini.repository.ProductRepository;
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

    public List<Product> getProductByProductScaleAndLine(String productScale, String productLine) {
        checkProductScale(productScale);
        return productRepository.readValuesByProductScaleAndLine(productScale, productLine);
    }

    private void checkProductScale(String productScale) {
        if (!productScale.matches("\\d:\\d{2}")) {
            Logger.error(() -> new InvalidFormat("You entered an invalid format for product scale"));
            throw new InvalidFormat("You entered an invalid format for product scale");
        }
    }

    private void checkProductCode(String productCode) {
        if (!productCode.matches("[S]\\d{2}_\\d{4}")){
            Logger.error(() -> new InvalidFormat("You entered an invalid format for product code"));
            throw new InvalidFormat("You entered an invalid format for product code");
        }
    }
}

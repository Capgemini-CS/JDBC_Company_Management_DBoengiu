package com.capgemini;

import com.capgemini.products.service.ProductService;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ProductService productService = new ProductService();
        System.out.println(productService.getAllProducts().size());

        System.out.println(productService.getProductByProductCode("S10_1279"));
        System.out.println(productService.getProductByProductCode("S11_1470"));

        System.out.println(productService.getProductByProductScaleAndLine("1:12", "Motorcycles"));
//        System.out.println(productService.getProductByProductScaleAndLine("1:l", "Motorcycles"));

    }
}

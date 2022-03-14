package com.capgemini.controller;

import com.capgemini.service.ProductService;

public class ProductController {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        System.out.println(productService.getAllProducts().size());

        System.out.println(productService.getProductByProductCode("S10_1279"));
        System.out.println(productService.getProductByProductCode("S11_1470"));

        System.out.println(productService.getProductByProductScaleAndLine("1:12","Motorcycles"));
//        System.out.println(productService.getProductByProductScaleAndLine("1:l", "Motorcycles"));

    }

}

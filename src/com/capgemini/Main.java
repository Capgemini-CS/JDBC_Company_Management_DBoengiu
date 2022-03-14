package com.capgemini;

import com.capgemini.products.service.ProductService;

public class Main {

    public static void main(String[] args) {
	// write your code here
    ProductService productService = new ProductService();
        System.out.println(productService.getAllProducts().size());



    }
}

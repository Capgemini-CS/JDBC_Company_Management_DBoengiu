package com.capgemini.exceptions;

public class ProductCodeInvalidFormat extends RuntimeException{
    public ProductCodeInvalidFormat(String message) {
        super(message);
    }
}

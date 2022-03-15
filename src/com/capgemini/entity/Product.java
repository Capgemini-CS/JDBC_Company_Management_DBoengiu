package com.capgemini.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Product {

    @Getter @Setter
    private String productCode;

    @Getter @Setter
    private String productName;

    @Getter @Setter
    private String productLine;

    @Getter @Setter
    private String productScale;

    @Getter @Setter
    private String productVendor;

    @Getter @Setter
    private String productDescription;

    @Getter @Setter
    private int quantityInStock;

    @Getter @Setter
    private double buyPrice;

    @Getter @Setter
    private double MSRP;


}

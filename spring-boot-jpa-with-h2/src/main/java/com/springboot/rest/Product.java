package com.springboot.rest;


public class Product {

//    private Long productId;
    private String productName;

    public Product(){}
    public Product( String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

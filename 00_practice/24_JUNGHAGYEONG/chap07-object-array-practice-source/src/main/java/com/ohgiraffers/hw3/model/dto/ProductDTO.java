package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {

    private int pId;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {

    }

    public ProductDTO(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return "제품번호: " + pId + ", 제품명: " + pName + ", 가격: " + price + "원, 세금: " + tax;
    }
}

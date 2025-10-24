package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
    private int pid;
    private String pName;
    private int price;
    private double tax;
    ProductDTO(){}
    ProductDTO(int pid, String pName, int price, double tax) {}
    public String information(){
        return "ProductDTO{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

}

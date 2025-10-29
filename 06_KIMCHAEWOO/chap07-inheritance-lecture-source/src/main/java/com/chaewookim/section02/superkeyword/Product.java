package com.chaewookim.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    public Product() {

        /*
        * 아무 클래스도 상속받지 않았는데 super()가 호출이 됨
        * java.util.Object 클래스의 ㅅ애성자를 호출하게 됨
        * 모든 클래스는 Object를 상속받기 때문
        * */
        super();
        System.out.println("Product 클래스의 기본 생성자 호출");
    }

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 클래스의 매개변수 있는 생성자 호출");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInformation() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}

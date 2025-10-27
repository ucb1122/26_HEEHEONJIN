package com.sekong.section07.initblock;

public class Product {
    // 1. JVM의 기본값
    // 2. 명시적 초기화
    private String name = "은하수";
    private int price = 200000;
    private static String brand = "삼성";
    // 3. 초기화 블록
    // static 초기화 블럭

    static{
        brand = "엘지";
        System.out.println("static 초기화 블럭 동작");
    }
    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 80000;

        brand = "애플";
        System.out.println("인스턴스 초기화 블럭 동작");
    }

    // 4. 기본 생성자
    public Product() {
        name = "갤럭시";
        System.out.println("기본 생성자 동작함");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 동작함");
    }

    public String getInformation(){
        return this.name + " " + this.price + " " + Product.brand;
    }
}

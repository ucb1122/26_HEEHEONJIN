package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {
    } //기본

    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    } // 3개 초기화

        public BookDTO(String title, String publisher, String author, int price, double discountRate) {
            this.title = title;
            this.publisher = publisher;
            this.author = author;
            this.price = price;
            this.discountRate = discountRate;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    /*public void printInformation () {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Discount Rate: " + discountRate);

    }*/
    public void printInformation() {
        System.out.println(title + " " + publisher + " " + author + " " + price + " " + discountRate);
    }

    }



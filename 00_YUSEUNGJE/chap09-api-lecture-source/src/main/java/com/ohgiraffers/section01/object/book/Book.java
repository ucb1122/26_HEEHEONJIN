package com.ohgiraffers.section01.object.book;

import java.util.Objects;

public class Book {
    /* 필드 선언 */
    private int number;
    private String title;
    private String author;
    private int price;

    /* 기본생성자 */
    public Book() {
        super();
    }
    /* 모든 필드를 초기화하는 생성자 */

    /* getter & setter */
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    /* 1. toString 오버라이딩 */
    @Override
    public String toString() {
        return "[" +
                "number= " + number +
                ", title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", price= " + price +
                ']';
    }

    /* 2. equals() 오버라이딩 */
//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj == null) {
//            return false;
//        }
//
//        Book other = (Book) obj;
//
//        if(this.number != other.number){
//            return false;
//        }
//
//        if(this.title == null){
//            if(other.title != null){
//                return false;
//            }
//        } else if(!this.title.equals(other.title)){
//            return false;
//        }
//
//        if(this.author == null){
//            if(other.author != null){
//                return false;
//            }
//        } else if(!this.author.equals(other.author)){
//            return false;
//        }
//
//        if(this.price != other.price){
//            return false;
//        }
//
//        return true;
//    }
//
//    /* 3. hashCode() 오버라이딩 */
//    @Override
//    public int hashCode() {
//        /* 곱셈연산을 누적시켜야하기 때문에 0이 아닌 값으로 초기화 */
//        int result = 1;
//
//        /*
//        필드마다 곱해줄 소수값을 선언
//        31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확률을 증가시킨다.
//        */
//        final int PRIME = 31;
//
//        result = PRIME * result + this.number;
//        result = PRIME * result + this.title.hashCode();
//        result = PRIME * result + this.author.hashCode();
//        result = PRIME * result + this.price;
//
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}

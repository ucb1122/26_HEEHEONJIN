package main.java.com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    String title;
    String publisher;
    String author;
    int price;
    double discountRate;

    public BookDTO() {
    }

    public BookDTO(String title, String publisher, String author) {}

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {}

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

    public void printInformation() {
        System.out.print(title + ", ");
        System.out.print(publisher + ", ");
        System.out.print(author + ", ");
        System.out.print(price + ", ");
        System.out.print(discountRate);
    }
}

package com.ohgiraffers.section01.object.book;

public class Application2 {
    public static void main(String[] args) {

        /*
        Object 클래스의 equals() 메소드

        equals() 메소드 오버라이딩
        equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여  true or false를 반환
        즉, 동일한 인스턴스인지를 비교하는 기능

        동일객체와 동등객체
        동일객체: 주소가 동일한 인스턴스
        동등객체: 주소는 다르더라도 필드값이 동일한 객체
         */
        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);
        System.out.println("book1 : " + book1.hashCode());
        System.out.println("book2 : " + book2.hashCode());

    }
}

package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO b = new BookDTO();
        b.showBookInfo();

        b.BookDTO("자바의 정석","도우출판","남궁성");
        b.showBookInfo();

        b.BookDTO("홍길동전","활빈당","허균",5000000,0.5);
        b.showBookInfo();
    }
}

package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

    // 필드
    public static void main(String[] args) {
        BookDTO bookDto = new BookDTO();
        bookDto.printInformation();

        BookDTO bookDto2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDto2.printInformation();

        BookDTO bookDto3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        bookDto3.printInformation();
    }
}

package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.awt.*;
import java.util.Scanner;


public class LibraryMenu {

    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.print("이름 입력 : ");
        String name = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("성별 입력 : ");
        char gender = sc.next().charAt(0);
        System.out.println();

        Member member = new Member(name,age,gender);
        lm.insertMember(member);

        while(true) {
            System.out.println("""
                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기
                """);

            System.out.print("실행할 메뉴 번호를 입력하세요 : ");
            switch (sc.nextInt()) {
                case 1: lm.myInfo(); break;
                case 2: selectAll(); break;
                case 3: searchBook(); break;
                case 4: rentBook(); break;
                case 0: System.exit(0); break;
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();

        for(int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i].toString());
        }
        System.out.println();
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.next();

        Book[] searchList = lm.searchBook(keyword);
        try {
            for(Book book : searchList) {
                System.out.println(book.toString());
            }
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    public void rentBook() {
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();

        int result = lm.rentBook(index);
        if(result == 0) System.out.println("성공적으로 대여되었습니다.");
        if(result == 1) System.out.println("나이 제한으로 대여 불가능입니다.");
        if(result == 2) System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        System.out.println();
    }
}

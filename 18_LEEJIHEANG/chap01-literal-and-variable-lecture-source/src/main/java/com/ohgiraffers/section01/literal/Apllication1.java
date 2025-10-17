package com.ohgiraffers.section01.literal;

import java.sql.SQLOutput;

public class Apllication1 { //public default private protected 접근제한자 Apllication은 클래스명

    public static void main(String[] args){ //static은 공유의 개념을 가지고 있음 해당내용을 언제 어디서든지 실행 반환형 void 공허한 반환없음 자료형 main은 기능 메소드의 명을 의미한다. main()메소드라고 지칭한다.
//         한줄 주석
        //args argument
        /*
        * 여기도 주석
        * 안에도 주석
        * 여러줄 주석
         */
        /**/
        System.out.println("Hello World");
        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
    //    System.out.println(''); // 아무 문자도 기록되지 않는 경우에도 오류
        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        //논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true");
    }
}
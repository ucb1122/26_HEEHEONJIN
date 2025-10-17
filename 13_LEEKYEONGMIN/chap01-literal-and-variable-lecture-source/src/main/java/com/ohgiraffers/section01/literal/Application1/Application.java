package com.ohgiraffers.section01.literal.Application1;

public class Application {

    public static void main(String[] args) {
        // 한줄 주석
        /**/
//        /*
//        * 여기도 주석
//        * 아래도 주석
//        * 여러줄 주석
//         */
        System.out.println("Hello World");
        // 여러가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);
        // 실수 형태의 값 출력
        System.out.println(1.23);
        // 문자 형태의 값 출력 - 여러글자 넣으면 오류
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
//        System.out.println("");
        // 문자열 형태의 값 출력 - 한개를 넣어도 상관없음
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");
        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true");
    }
}

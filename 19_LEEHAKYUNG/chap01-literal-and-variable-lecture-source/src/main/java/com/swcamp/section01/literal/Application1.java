package com.swcamp.section01.literal;

public class Application1 {

    public static void main(String[] args) {
        // 한줄 주석
        /*
        여러줄
        주석 가능
        다 주석
         */
        System.out.println("Hello World");

        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.23);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println("aa");   // 여러 문자는 큰 따옴표로
        System.out.println('1');
        System.out.println('\u0000');
        System.out.println("");     // 빈 문자('')는 불가능, 빈 문자열("")은 가능

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true");

    }
}

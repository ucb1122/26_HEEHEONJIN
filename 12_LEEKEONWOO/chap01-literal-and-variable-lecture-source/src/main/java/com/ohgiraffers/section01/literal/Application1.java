package com.ohgiraffers.section01.literal;
// 회사 도메인을 거꾸로 쓴다.
public class Application1 {
 // public: 접근제한자  static: 공유 언제어디서든지 실행
    public static void main(String[] args) {
                // void: 반환형
        //한줄 주석
        /*
        여
        러
        줄

        주석
         */
        System.out.println("Hello World");
        // System.out.println("메소드");

        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
//        System.out.println(''); // 아무 문자도 기록되지 않는 경우에도 오류

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("");

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true");

    }
}

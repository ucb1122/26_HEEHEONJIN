package com.lhw.section01.literal;

public class Application1 {

    public static void main(String[] args) {
//        Ctrl + '/' = 한줄 주석처리
        /*Ctrl + Shift + '/' = 많은 줄 주석처리*/
//        Shift + Alt = 한 줄 이동
//        sout => System.out.println( "Hello World");
        System.out.println("Yellow World");

//        여러 가지 값의 형태를 출력할 수 있다.
//        정수 형태의 값 출력
        System.out.println(1234567890);

//        실수 형태의 값 출력
        System.out.println(1.2340);

//        문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
//        System.out.println(''); 비어있는 문자열은 작성할 수 없다.
        System.out.println(""); // 대신 이렇게는 가능하다.

//        문자열 형태의 값
        System.out.println("안뇽");
        System.out.println("a");
        System.out.println("");

//        논리 형태
        System.out.println(true);
        System.out.println(false);
    }
}

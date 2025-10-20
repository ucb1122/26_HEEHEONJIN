package com.swcamp.section01.literal;

public class Application2 {

    public static void main(String[] args) {
        // 정수와 정수의 연산
        System.out.println("=========================정수와 정수의 연산=========================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        // 언제나 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("=========================정수와 정수의 연산=========================");
        System.out.println(123 % 0.5);

        // 문자의 연산
        System.out.println("=========================문자와 문자의 연산=========================");
        System.out.println('a' + 'b');

        System.out.println("=========================문자와 정수의 연산=========================");
        System.out.println('a' + 1);    // a = 97

        System.out.println("=========================문자와 실수의 연산=========================");
        System.out.println('a' + 1.0);

        // 문자는 내부적으로 숫자 취급


        System.out.println("=========================문자열 연산=========================");
        System.out.println("hello" + " world");
        System.out.println(9 + 9);      // 숫자 18
        System.out.println("9" + 9);    // 문자열 99
        System.out.println(9 + "9");    // 문자열 99
        System.out.println("9" + "9");  // 문자열 99
        System.out.println(9 + 9 + "9");// 문자열 189 -> 왼쪽에서 숫자끼리 계산해서 18, 그 후 캐스팅 연산
        System.out.println("9" + 9 + 9);// 문자열 999
        System.out.println("" + 9 + 9);// 문자열 99 -> 빈 문자열 추가로 숫자를 문자로 바꿀 수 있다.

        System.out.println("=========================논리값=========================");

    }
}

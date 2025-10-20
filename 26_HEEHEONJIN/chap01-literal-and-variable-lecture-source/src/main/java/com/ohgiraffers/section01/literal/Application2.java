package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("==================정수와 정수의 연산==================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("==================실수와 실수의 연산==================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 3.0); // 약간의 오차가 생긴다.

        // 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("==================정수와 실수의 연산==================");

        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        //문자와 연산
        System.out.println("==================문자와 문자의 연산==================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        //문자열과 문자열의 '+' 연산만 가능하고, 연산 결과는 문자열에
        //System.out.println("hello" - "world");

        System.out.println("hello" + 123);


    }
}

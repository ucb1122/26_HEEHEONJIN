package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("==== 정수 연산 ===");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("=== 실수 연산 ===");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);			//약간의 오차가 생긴다

        double d = 0.1;
        double b = 1.1;
        System.out.println(d+b == 1.2);

        System.out.println("=== 정수와 실수의 연산 ===");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);

        // 문자의 연산
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');

        System.out.println("hello "+123);
        System.out.println("hello" + true);

        System.out.println(9+9);
        System.out.println("9");
        System.out.println(9+"9");
        System.out.println("9"+"9");



    }
}

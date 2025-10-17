package com.ohgiraffers.section01.literal;

public class application2 {
    public static void main(String[] args) {
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123*10);
        System.out.println(123/10);
        System.out.println(123%10);

        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 3.0); //약간의 오차가 생긴다

        //정수와 실수의 연산의 결과는 실수로 리턴
        System.out.println(123+0.5);
        System.out.println(123_0.5);
        System.out.println(123*0.5);
        System.out.println(123/0.5);
        System.out.println(123%0.5);

        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
        // 문자는 내부적으로 숫자 취급을 한다.

        // 문자열과 문자열의 '+'연산만 가능하고, 연산 결과는 문자열 합치기(이어붙이기)된다.

        System.out.println("hello" + "world");
        //System.out.println("hello" - "world");			//에러 발생
        //System.out.println("hello" * "world");			//에러 발생
        //System.out.println("hello" / "world");			//에러 발생
        //System.out.println("hello" % "world");			//에러 발생

        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);
        System.out.println("123"+"456");

        int age;
        age = 20;



    }
}





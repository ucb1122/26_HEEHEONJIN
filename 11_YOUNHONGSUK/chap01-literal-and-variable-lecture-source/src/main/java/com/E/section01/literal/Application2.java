package com.E.section01.literal;

public class Application2 {

    public static void main(String[] args){

        //정수와 정수의 연산
        System.out.println(1+1);
        System.out.println(123+111);
        System.out.println(12*14);
        System.out.println(12/14);
        System.out.println(12%14);

        //실수와 실수의 연산
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 / 10);
        System.out.println(1.23 % 10.);
        System.out.println(1.23 * 10.);

        //실수와 정수의 연산
        //정수와 실수를 계산 할 때는 정수를 실수로 변환해서 계산한다
        System.out.println(123+0.5);
        System.out.println(123-0.5);
        System.out.println(123*0.5);
        System.out.println(123/0.7);
        System.out.println(123%0.7);

        //문자의 연산
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        //문자와 실수의 연산
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        //문자와 정수의 연산
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        //문자열은 + 연산만 가능하고 연산 결과는 문자열 합치기(이어 붙이기) 된다
        System.out.println("hello"+123);
        System.out.println("hello"+true);

    }
}

package com.hihi.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        // 정수와 정수의 연산
        System.out.println("=================정수와 정수의 연산 ==================");
        System.out.println(123 + 456);
        System.out.println(123-23);
        System.out.println(123 * 10);
        System.out.println(123 / 10); //몫의 값
        System.out.println(123 % 10);

        System.out.println("=================실수와 실수의 연산 ==================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 3.0);

        // 언제나 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("=================정수와 실수의 연산 ==================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);

        //문자의 연산
        System.out.println("=================문자의 연산 ==================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("=================문자와 정수의 연산 ==================");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("=================문자와 정수의 연산 ==================");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        //결론은 문자는 내부적으로 숫자 취급을 한다
        // 결국 지금까지 숫자끼리의 연산을 확인한 것이다.

        // 문자열의 연산
        // 문자열과 문자열의 '+'연산만 간능하고, 연산ㄴ 결과는 문자열 합치기(이어 붙이기)된다.
        System.out.println("=================문자열과 문자열의 연산 ==================");
        System.out.println("hello" + " world");
//        System.out.println("hello" - " world");
//        System.out.println("hello" * " world");
//        System.out.println("hello" % " world");

        System.out.println("=================문자열과 다른 형태의의 연산 ==================");
        System.out.println("hello" + 123);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

        // 논리 연산은 모든 사칙연산이 안된다
        // 논리값과 문자열의 + 연산만 사용가능하디.
        System.out.println("123" + "456");

        System.out.println("============================================");
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        System.out.println("============================================");
        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);
        System.out.println("9" + (9 + 9));

        // 3. 시간에 따라 변경되는 값을 저장하고 사용할 목적
        System.out.println("=============변수에 저장한 값 변경 테스트");

        int sum = 0;

        sum = sum + 10;

        System.out.println("sum에 10을 더하면 sum의 값은?" + sum);
        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        System.out.println("sum에 10을 네번 더 누적하면 sum의 값은? " + sum);




}}

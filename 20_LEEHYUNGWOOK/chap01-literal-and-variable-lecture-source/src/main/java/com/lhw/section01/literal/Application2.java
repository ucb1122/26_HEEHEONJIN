package com.lhw.section01.literal;

public class Application2 {
    public static void main(String[] args) {

//        정수와 정수의 연산
        System.out.println("==========정수와 정수의 연산==========");
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123 * 10); //곱셈
        System.out.println(123/10); //몫
        System.out.println(123%10); //나머지


//        실수간 연산
        System.out.println("==========실수간 연산==========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);

//        정수, 실수 간 연산
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

//        문자 간 연산
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

//        문자 vs 정수
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

//        문자열 이어붙이기
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

//        문자열과 문자열의 연산
//        문자열과 문자열의 '+' 연산만 가능하고, 연산 결과는 문자열 합치기된다.
        System.out.println("hello" + "world");
//      System.out.println("hello" - "world");			//에러 발생
//      System.out.println("hello" * "world");			//에러 발생
//      System.out.println("hello" / "world");			//에러 발생
//      System.out.println("hello" % "world");			//에러 발생

//        문자열과 다른 리터럴의 연산
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");
        System.out.println("안녕안녕");

        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);
        System.out.println("9" + (9 + 9));

        System.out.println("=========== 10과 20의 사칙연산 결과 ===========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("=========== 10과 20의 사칙연산 결과 보기 좋게 출력 ===========");
        System.out.println("10과 20의 합 : " + (10 + 20));		//주의 : 괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다.
        System.out.println("10과 20의 차 : " + (10 - 20));		//문자열은 마이너스 연산이 불가능하기에 앞에서 생성된 문자열과 마이너스 연산이 불가하다. (반드시 괄호 사용)
        System.out.println("10과 20의 곱 : " + (10 * 20));		//아래 부터는 동일한 방식이다.
        System.out.println("10과 20을 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20을 나누기 한 나머지 : " + (10 % 20));
    }
}

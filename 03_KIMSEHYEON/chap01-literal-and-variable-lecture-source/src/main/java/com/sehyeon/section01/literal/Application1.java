package com.sehyeon.section01.literal;


public class Application1 {
    // public: 접근 제한자 static: 공유 언제 어디서든지 실행 void: 반환형, 반환없음 자료형
    public static void main(String[] args){
        // 한줄 주석
        /**/
        System.out.println("Hello World");
        // 1 리터럴
        // 1. 여러 가지 값의 형태를 출력할 수 있다.

        // 1-(1) 정수 형태의 값 출력
        System.out.println(123);

        // 1-(2) 실수 형태의 값 출력
        System.out.println(1.234);

        // 1-(3) 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
        // System.out.println(''); 아무값도 안들어간 경우 오류

        // 1-(4) 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        // 1-(5) 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true"); // 다음은 논리 형태의 값이 아닌 문자열

        // 2. 숫자 리터럴의 연산

        // 2-(1) 정수와 정수의 연산
        System.out.println(123 + 456); // 덧셈
        System.out.println(123 - 23); // 뺄셈
        System.out.println(123 * 10); // 곱셈
        System.out.println(123 / 10); // 나눗셈 - 몫
        System.out.println(123 % 10); // 나눗셈 - 나머지

        // 2-(2) 실수와 실수의 연산
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);			//약간의 오차가 생긴다

        // 2-(3) 정수와 실수의 연산
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 3. 문자 리터럴의 연산

        // 3-(1) 문자와 문자의 연산
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        // 3-(2) 문자와 정수의 연산
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        // 3-(3) 문자와 실수의 연산
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 문자는 내부적으로 숫자 취급

        // 4. 문자열 리터럴의 연산
        //문자열은 사칙 연산 중 ‘+’ 연산만 가능하며, 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        // 4-(1) 문자열과 문자열의 연산
        System.out.println("hello" + "world");
        //System.out.println("hello" - "world");			//에러 발생
        //System.out.println("hello" * "world");			//에러 발생
        //System.out.println("hello" / "world");			//에러 발생
        //System.out.println("hello" % "world");			//에러 발생

        // 4-(2) 문자열과 다른 리터럴의 연산
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");

        // 5. 논리 리터럴의 연산
        //논리 값은 내부적으로 숫자로 취급하긴 하지만 연산은 불가능하다. 단, 문자열과의 ‘+’ 연산은 가능하다.
        // 5-(1) 논리와 논리의 연산
        //System.out.println(true + false);				//에러 발생
        //System.out.println(true - false);				//에러 발생
        //System.out.println(true * false);				//에러 발생
        //System.out.println(true / false);				//에러 발생
        //System.out.println(true % false);				//에러 발생

        // 5-(2) 논리와 정수의 연산
        //System.out.println(true + 1);				//에러 발생
        //System.out.println(true - 1);				//에러 발생
        //System.out.println(true * 1);				//에러 발생
        //System.out.println(true / 2);				//에러 발생
        //System.out.println(true % 2);				//에러 발생

        // 5-(3) 논리와 실수의 연산
        //System.out.println(true + 1.0);				//에러 발생
        //System.out.println(true - 1.0);				//에러 발생
        //System.out.println(true * 1.0);				//에러 발생
        //System.out.println(true / 2.0);				//에러 발생
        //System.out.println(true % 2.0);				//에러 발생

        // 5-(4) 논리와 문자의 연산
        //System.out.println(true + 'a');				//에러 발생
        //System.out.println(true - 'a');				//에러 발생
        //System.out.println(true * 'a');				//에러 발생
        //System.out.println(true / 'a');				//에러 발생
        //System.out.println(true % 'a');				//에러 발생

        // 5-(5) 논리와 문자열의 연산
        System.out.println(true + "a");		  		//문자열 합치기 됨
        //System.out.println(true - "a");				//에러 발생
        //System.out.println(true * "a");				//에러 발생
        //System.out.println(true / "a");				//에러 발생
        //System.out.println(true % "a");				//에러 발생

        // 6. 문자열 이어붙이기

        // 6-(1) 두 개의 값 이어붙이기
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        // 6-(2) 세 개의 값 이어붙이기
        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);
        System.out.println("9" + (9 + 9));

        // 6-(3) 문자열 이어붙이기 응용
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

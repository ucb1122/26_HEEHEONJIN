package com.ohgiraffers.section01.level01.example;

import java.util.Random;
import java.util.Scanner;

public class ExampleTest {

    /*
    메소드명 : evenOdd(int value)
    반환형 : void
    사용자로부터 정수하나를 입력받아
    해당 숫자가 짝수인지 홀수인지 판별하세요.

    --- 출력 예시 ---
    짝수입니다

    홀수입니다
    * */

    public void evenOdd(int value) {
        if(value % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }

    /*
    * 메소드명 : findMax(int first, int second)
    * 리턴타입 : void
    * 두 수중 더 큰수 찾기
    * 사용자로부터 정수 두개를 입력받아 더큰수를 출력
    * */

    public void findMax(int first, int second) {
        if(first > second) {
            System.out.println(first + " > " + second);
        } else {
            System.out.println(second + " > " + first);
        }
    }

    /*
    * 메소드명 randomMathQuiz(int num1, int num2)
    * 리턴타입 : void
    * 1~10 사이의 임의의 정수 2개를 생성
    * 사용자에게 "num1 + num2 = ?" 뭘까라고 질문
    * 사용자로부터 정답을 입력받는다.
    * 사용자의 답이 실제 정답과 일치하는지 판별하고 결과를 출려
    *
    * -- 출력 예시
    * 정답입니다!
    *
    * 틀렸습니다 정답은 2 입니다.
    * */

    public void randomMathQuiz() {

        Random rand = new Random();
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;
        System.out.println(num1 + " + " + num2 + " = ?");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == num1 + num2) {
            System.out.println("정답 입니다!");
        } else {
            System.out.println("틀렸습니다 정답은 " + (num1 + num2) + " 입니다.");
        }
    }
}

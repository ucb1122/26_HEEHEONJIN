package com.ohgiraffers.section01.level01.exampel;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("evenOdd");
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        ExampleTest.evenOdd(num);

        System.out.println("findMax");
        System.out.print("첫번 째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.print("두번 째 숫자 입력 : ");
        int second = sc.nextInt();
        ExampleTest.findMax(first, second);

        System.out.println("randomMathQuiz");
        ExampleTest.randomMathQuiz();

        sc.close();

    }
}

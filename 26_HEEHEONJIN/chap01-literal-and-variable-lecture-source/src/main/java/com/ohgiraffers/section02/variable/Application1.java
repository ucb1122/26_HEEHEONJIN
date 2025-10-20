package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        // 변수의 사용 목적

        // 1. 값에 의미를 부여하기 위한 목적(가독성)
        System.out.println("==============값에 의미 부여 테스트");
        System.out.println("보너스를 포함한 급여: " + (1000000+200000) + "원");
        System.out.println("==============변수의 저장값 재사용 테스트");

        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");

        System.out.println();

        int point = 300;
        System.out.println("1번 고객에게 포인트를" + point + "100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를" + point + "100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를" + point + "100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를" + point + "100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를" + point + "100포인트 지급하였습니다.");

        System.out.println("==============변수에 저장한 값");
        int sum = 0;
        sum = sum + 10; //

    }
}

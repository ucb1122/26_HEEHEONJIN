package com.hihi.section02.variable;

public class Application1 {

    public static void main(String[] args) {

        // 변수 사용 목적

        //1. 값의 의미를 부여하기 위한 목적(가독성)
        System.out.println("=========값에 의미 부여 테스트");
        System.out.println("보너스를 포함한 급여" + (10000 + 20000) + "월");

        int salary = 1000;
        int bonus = 2000;
        System.out.println("보너스를 포함한 급여: " + (salary + bonus));

        // 2. 한번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("++++++++++++++++++++=변수에 저장한 값 재사용 테스트");
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");

        System.out.println(); // 공백 한 줄 추가

        int point = 300;
        System.out.println("++++++++++++++++++++=변수에 저장한 값 재사용 테스트");
        System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
    }
}

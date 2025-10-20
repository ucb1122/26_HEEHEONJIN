package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        // 변수의 사용 목적

        // 1. 값에 의미를 부여하기 위한 목적(가독성)
        System.out.println("===============값에 의미 부여 테스트");
        System.out.println("보너스를 포함한 급여: " + (1000000 + 200000) + "원");

        int salary = 1000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));

        // 2. 한번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("=============== 변수에 저장한 값 재사용 테스트");

        System.out.println("1번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트를 지급하였습니다.");

        System.out.println(); // 공백 한줄 추가

        int point = 400;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트를 지급하였습니다.");


        // 3. 시간에 따라 변경되는 값을 저장하고 사용할 목적
        System.out.println("============ 변수에 저장한 값 변경 테스트");
        int sum = 0;
        sum = sum + 10; // 현재 sum의 값은 0이고, 0과 10을 더한 결과를 sum변수에 저장.

        System.out.println("sum에 10을 더하면 sum의 값은? : " +  sum);

        sum = sum + 10; // sum에는 20
        sum = sum + 10; // sum에는 30
        sum = sum + 10; // sum에는 40
        sum = sum + 10; // sum에는 50

        System.out.println("sum에 10을 네번 더 누적하면 sum의 값은? : " +  sum);
    }
}

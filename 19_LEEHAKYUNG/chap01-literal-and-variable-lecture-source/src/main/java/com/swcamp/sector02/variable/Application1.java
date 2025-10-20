package com.swcamp.sector02.variable;

public class Application1 {

    public static void main(String[] args) {
        // 변수의 사용 목적

        // 1. 값에 의미를 부여하기 위한 목적(가독성)
        System.out.println("보너스를 포함한 급여: " + (1000000 + 200000) + "원");

        int salary = 100000;
        int bonus = 20000;
        System.out.println("보너스를 포함한 급여: " + (salary + bonus) + "원");

        int point = 300;
        int sum = 0;

        sum += point;


        final int AGE;  // 상수의 변수명은 대문자로 표기(암묵적)


        System.out.println("byte값의 범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char값의 범위: " + (int) Character.MIN_VALUE + " ~ " + (int) Character.MAX_VALUE);
        System.out.println("int값의 범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long값의 범위: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        byte num1 = 126;

        num1++;

        System.out.println("num1 = " + num1);

        num1 += 1;
        System.out.println("num1 = " + num1);

        // 언더플로우
        // 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상
        num1 = -128;
        System.out.println("num1 = " + num1);
        num1--;
        System.out.println("num1 = " + num1);

        int fisrtNum = 1000000;
        int secondNum = 700000;
//        int multi = fisrtNum * secondNum;         overflow.
//        long multi = fisrtNum * secondNum;        still overflow.
        long multi = (long)fisrtNum * secondNum;        // 작은 자료형은 큰 자료형을 따라간다.
        System.out.println("long multi : " + multi);

        long test = 1243123412;


    }
}

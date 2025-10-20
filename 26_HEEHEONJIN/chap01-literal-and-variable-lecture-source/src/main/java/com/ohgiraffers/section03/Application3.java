package com.ohgiraffers.section03;

import java.sql.SQLOutput;

public class Application3 {
    public static void main(String[] args) {
        final int AGE; // 상수의 변수명은 대문자로 표기(암묵적)

        AGE = 18;
        // AGE = 20 불가능

        System.out.println("AGE = " + AGE);

        int myAge = AGE;
        System.out.println("myAge = " + myAge);
    }
}

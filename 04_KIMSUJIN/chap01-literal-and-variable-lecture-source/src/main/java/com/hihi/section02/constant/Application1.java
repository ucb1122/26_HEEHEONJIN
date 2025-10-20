package com.hihi.section02.constant;

public class Application1 {

    public static void main(String[] args) {

        final int AGE; // 상수의 변수명은 대문자

        AGE = 18;
//        AGE = 20;         ->이미 할당 됨

        System.out.println("AGE = " + AGE);

        int myAge = AGE;
        System.out.println("myAge = " + myAge);

    }

}

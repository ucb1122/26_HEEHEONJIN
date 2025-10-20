package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args) {

        final int AGE; // 상수의 변수명은 대문자로 표기 (암묵적) final은 종단 의미
        
        AGE = 18;
//        AGE = 20; > 안됨

        System.out.println("AGE = " + AGE);
        
        int myAge = AGE;
        System.out.println("myAge = " + myAge);


    }
}

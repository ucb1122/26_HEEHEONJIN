package com.lhw.section03.constant;

public class Application1 {
    public static void main(String[] args) {
//        상수
        final int MAX = 100;
        System.out.println(MAX);

        final int AGE; // 변수를 더 이상 바꾸지 않겠다는 의미의 FINAL
        AGE = 18;
//        AGE = 20;
        System.out.println("AGE = " + AGE);

        int myAge = AGE;
        System.out.println("제 나이는 " + myAge + "살이에요");
    }
}

package com.ohgiraffers.section01.method;

public class Applicaiton6 {

    public static void main(String[] args) {
        System.out.println("main() 메소드 호출 함");
        String result = testMethod();
        System.out.println("result = " + result);

        System.out.println("result2 = " + testMethod());

        System.out.println("main() 메소드 종료함");
    }

    public static String testMethod() {
        System.out.println("testMethod()메소드 실행함");
        return "test";
    }
}

package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        String result = testMethod();
        System.out.println("main() 메소드 종료함");

    }
    public static String testMethod(){
        System.out.println("testMethod() 실행함");
        return "test";
    }
}

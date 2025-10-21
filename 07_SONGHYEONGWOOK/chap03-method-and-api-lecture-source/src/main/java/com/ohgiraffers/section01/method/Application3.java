package com.ohgiraffers.section01.method;

public class Application3 {

    // 전역 변수
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {

        int local = 20; // 지역변수
        System.out.println("local = " + local);
        System.out.println("global = " + global);
        test(local);

        Application3 app = new Application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod((int)12.35);
        app.testMethod(3 * 8);

        new Application3().testMethod(local); // 한번 쓰고 말 것인 코드. 재사용 X 새로운 객체 생성
    }

    public static void test(int testValue) {
        System.out.println(testValue);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }

    public void testMethodA(String name, int age, char gender) {
    }
}

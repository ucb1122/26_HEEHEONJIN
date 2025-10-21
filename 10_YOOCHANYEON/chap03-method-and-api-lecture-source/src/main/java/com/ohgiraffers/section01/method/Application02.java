package com.ohgiraffers.section01.method;

public class Application02 {

    public static void main(String[] args) {
        System.out.println("main() 시작됨");

        Application02 app = new Application02();
        app.methodA();
        app.methodB();

        System.out.println("main() 종료됨");
    }

    /*
        static 키워드가 없는
        non-static method 사용
     */
    public void methodA(){
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");

    }
    public void methodB(){
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}

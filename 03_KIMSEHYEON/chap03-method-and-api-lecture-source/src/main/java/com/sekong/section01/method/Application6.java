package com.sekong.section01.method;

public class Application6 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        Application6 app = new Application6();
        String result = testMethod();
        System.out.println("result: " + result);
        System.out.println("main() 메소드 종료함");
    }
    public static String testMethod(){
        System.out.println("testMethod()메소드 실행함");
        return "test return";
    }

}

package com.chaewookim.section03.math;

public class Application2 {
    public static void main(String[] args) {

        // Random() : 0.0 <= 값 < 1.0
        //            0.0 * 10 <= 값 < 1.0 * 10
        //            0.0 <= 값 < 10  -> 0-9
        // (int) Math.random() * (구하려는 난수의 개수) + 구하려는 난수의 최소값

        // 0-9까지의 난수 생성
        int random1 = (int) (Math.random() * 10);
        System.out.println("random1 = " + random1);

        // 1-10까지의 난수 생성
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.println("random2 = " + random2);

        // 10-15까지의 난수 생성
        int random3 = (int) (Math.random() * 6 + 10);
        System.out.println("random3 = " + random3);

        // -128~127까지의 난수 생성
        int random4 = (int) (Math.random() * 256 + -128);
        System.out.println("random4 = " + random4);
    }
}

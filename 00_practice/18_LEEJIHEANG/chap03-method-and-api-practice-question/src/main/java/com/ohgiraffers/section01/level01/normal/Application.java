package com.ohgiraffers.section01.level01.normal;

public class Application {

    public static void main(String[] args) {

        // 실행용 클래스
        RandomMaker randomMaker = new RandomMaker();
        randomMaker.tossCoin();

        String str1 = randomMaker.tosscoin(a,b);
        System.out.println("동전의 면은 " + str1 + "입니다.");
    }
}

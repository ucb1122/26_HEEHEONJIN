package com.hihi.section01.polymophism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 왠만해선 달리지 않습니다.  어슬렁 걸어감");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흥!");
    }

    public void bite(){
        System.out.println("호랑이가 물어 뜯습니다. 앙!");
    }
}

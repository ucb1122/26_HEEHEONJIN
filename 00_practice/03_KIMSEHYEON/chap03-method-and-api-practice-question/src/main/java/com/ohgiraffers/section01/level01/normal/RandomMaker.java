package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {
    // 기능형 클래스
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
    public String tossCoin(){
        int randomNumber = (int)(Math.random() * 2) ;
        String coin = (randomNumber == 0) ? "앞면" : "뒷면";
        return coin;
    }
}

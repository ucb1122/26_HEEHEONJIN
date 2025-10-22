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
    public static String tossCoin() {
        int coin = (int) (Math.random() * 10);    // 0 ~ 9
        String result = "";
        if (coin % 2 == 0) {
            result = "뒷면";
        }
        else {
            result = "앞면";
        }
        return result;
    }
}

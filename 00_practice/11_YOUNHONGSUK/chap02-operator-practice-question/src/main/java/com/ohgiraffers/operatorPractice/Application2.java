package com.ohgiraffers.operatorPractice;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
         * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
         *
         * 19
         *
         * ------ 출력 결과 --------
         * 청소년
         * */

        int a = 20;
        String result = (a <= 13)? "어린이" : (a < 19)? "청소년" : "성인";
        System.out.println(result);

    }
}

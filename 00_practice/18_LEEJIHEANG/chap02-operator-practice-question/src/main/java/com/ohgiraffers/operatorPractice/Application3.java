package com.ohgiraffers.operatorPractice;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 문자형 변수 하나를 선언하고 변수에 값이 M으로 초기화하면 남자입니다.
         * F이면 여성입니다를 출력하도록 작성하세요 (삼항연산자사용)
         *
         * M
         *
         * ---- 출력 결과 ---
         * 남자입니다.
         * */
        char ch1 = 'M';

        String result1 = (ch1 == 'M')? "남자입니다.": (ch1 == 'F')? "여성입니다.":"";

        System.out.println(result1);

        // 강사님 풀이

        char gender = 'M'; // 남자

        String result2 = (gender == 'M')? "남자입니다.": "여자입니다.";
        System.out.println("result2 = " + result2);


        char gender = 'm';

        System.out.println((gender=='M'||gender=='m')?"남자입니다.":"여성입니다.");

    }
}

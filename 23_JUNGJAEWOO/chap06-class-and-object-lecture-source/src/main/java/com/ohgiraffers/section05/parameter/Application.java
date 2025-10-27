package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        /*
         * 파라미터로 사용 가능한 자료형
         * 1. 기본자료형
         * 2. 기본자료형 배열
         * 3. 클래스자료형(참조자료형)
         * 4. 클래스자료형 배열(객체 배열이지만 다음쳅터에서 다룰예정)
         * 5. 가변인자
         * */

        parameterTest pt = new parameterTest();

        /* 1. 기본자료형을 매개변수로 전달받는 호출
         * 리터럴값(참조 주소값 x)을 전달해서 메도스를 호출 시에는 서로 다른 지역변수는 서로 영향 x
         * */
        int num = 20;
        System.out.println("call by value 전 : "+ num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by value 후 : "+ num);

        /* 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출
        * */
        int[] iarr = new int[]{1,2,3,4,5}; // iarr안에는 heap에 생성된 배열의 주소값을 가지고 있다.
        System.out.println("call by reference 전 : "+ Arrays.toString(iarr));
        pt.testPrimitiveTypeArrayParameter(iarr);
        System.out.println("call by reference 후 : "+ Arrays.toString(iarr));

        /* 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 */
        Rectangle r = new Rectangle(22,12);
        r.calArea();
        r.calRound();

        pt.testClassTypeParameter(r);

        // 5. 가변인자를 매개변수로 전달받는 메소드 호출(자바는 왠만하면 권장X)
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순", "탁구");
        pt.testVariableLengthArrayParameter(new String[]{"강감찬", "낚시", "독서"});

    }

}

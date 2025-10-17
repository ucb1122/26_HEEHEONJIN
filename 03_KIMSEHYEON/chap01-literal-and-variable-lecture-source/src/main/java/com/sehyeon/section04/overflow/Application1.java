package com.sehyeon.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("byte 값의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char 값의 범위 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
        System.out.println("short 값의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 값의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 값의 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float 값의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 값의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);


        // 오버플로우
        byte num1 = 127;
        System.out.println("num1 : " + num1);						      //127 : byte의 최대 저장 범위

        num1++;														                    //1 증가
        System.out.println("num1 overflow : " + num1);				//-128 : byte의 최소 저장 범위

        // 언더플로우
        byte num2 = -128;
        System.out.println("num2 : " + num2);						      //-128 : byte의 최소 저장 범위

        num2--;														                    //1 감소
        System.out.println("num2 underflow : " + num2);				//127 : byte의 최대 저장 범위

        // 문제 발생
        int firstNum = 1000000;			//100만
        int secondNum = 700000;			//70만

        int multi = firstNum * secondNum;		//7천억이 나와야 함

        System.out.println("firstNum * secondNum = " + multi);			//--79669248 이 나온다.

        // 해결 방법
        /* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
        long longMulti = firstNum * secondNum;

        System.out.println("longMulti : " + longMulti);		//여전히 오버플로우가 발생한다.

        /* 이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 위에 결과랑 별 차이가 없다.
         * 그럼 어떻게 해결을 해야 하나?
         * 계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 한다. (강제형변환 이용)
         * 강제 형변환은 바로 다음 섹션에서 다루게 될 예정이다.
         * */
        long result = (long) firstNum * secondNum;

        System.out.println("result : " + result);			//정상적으로 7천억이 출력될 것이다.



    }
}

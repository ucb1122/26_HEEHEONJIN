package com.hihi.section03;

public class Application1 {

    public static void main(String[] args) {

        System.out.println("byte 값의 범위: " +  Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println("char 값의 범위" +(int) Character.MIN_VALUE + "~" +(int) Character.MAX_VALUE);
        System.out.println("short 값의 범위" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        System.out.println("long 값의 범위" +  Long.MIN_VALUE + "~" + Long.MAX_VALUE);
        System.out.println("float 값의 범위" +Float.MIN_VALUE + "~" + Float.MAX_VALUE);
        System.out.println("double 값의 범위" + Double.MIN_VALUE + "~" + Double.MAX_VALUE);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        byte num1 = 126;

        num1 ++;        //후위 증감 연산자: 기본의 num1 변수에 있던 값에 1을 더해 다시 대입
                              // num = num + 1
        System.out.println("num1 = " + num1);

        //num1 = num1 + 1;
        num1 ++;
        System.out.println("num1 = " + num1);

        int firstNum = 1000000;			//100만
        int secondNum = 700000;			//70만

        int multi = firstNum * secondNum;		//7천억이 나와야 함

        System.out.println("firstNum * secondNum = " + multi);			//--79669248 이 나온다.

        // 강제 형변환
        long result = (long) firstNum * secondNum;

        System.out.println("result : " + result);


    }

}

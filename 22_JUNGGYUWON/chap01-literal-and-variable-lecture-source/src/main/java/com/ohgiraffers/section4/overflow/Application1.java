package com.ohgiraffers.section4.overflow;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("byte 값이 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char 값이 범위 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
        System.out.println("short 값이 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 값이 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 값이 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float 값이 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 값이 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

        byte num1 = 126;
        byte num2 = -125;

        System.out.println((byte)(num1*num2));

        num1++;
        System.out.println("num1 = " + num1);
        num1++;
        System.out.println("num1 = " + num1);
        num1--;
        System.out.println("num1 = " + num1);

        int firstNum = 1000000;
        int secondNum = 700000;

        long multi = (long)firstNum * secondNum;
        System.out.println("multi = " + multi);

    }
}

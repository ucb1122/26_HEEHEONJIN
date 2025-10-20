package com.ohgiraffers.section03.constant;

public class application2 {
    public static void main(String[] args) {
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40;

        System.out.println("byte값의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE );
        System.out.println("char값의 범위 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
        System.out.println("short값의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE );
        System.out.println("int값의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE );
        System.out.println("long값의 범위 : "  + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE );
        System.out.println("float값의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE );
        System.out.println("double값의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE );

        byte num1 = 126;
        num1++;
        System.out.println("num1 =" + num1);

        
    }
}

package com.lhw.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("byte 값의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char 값의 범위 : " + (int) Character.MIN_VALUE + " ~ " + (int) Character.MAX_VALUE);
        System.out.println("short 값의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 값의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 값의 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float 값의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 값의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

        System.out.println("=========================");
        System.out.println("오버플로우");
        byte bNum1 = 126;

        bNum1++;    // 후위 증감 연산자
        System.out.println("bNum1 = " + bNum1); // 127
        bNum1++;
        System.out.println("bNum1 = " + bNum1); // -128

//        언더플로우
//        오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상

        bNum1--;
        System.out.println("bNum1 = " + bNum1); // 127
        bNum1--;
        System.out.println("bNum1 = " + bNum1); // 126

        int firstNum = 1000000;
        int secondNum = 700000;
        System.out.println(firstNum * secondNum);

        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);
        
//        강제 형변환
        long result = (long) firstNum * secondNum;
        System.out.println("result = " + result);
        
    }
}

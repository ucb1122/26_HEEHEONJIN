package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        byte bNum;
        short sNum;
        int iNum;
        long lNum;

        float fNum;
        double dNum;

        char ch;

        boolean isTrue;

        String str;

        bNum = 1;
        sNum = 2;
        iNum = 3;
        lNum = 2200000000L;

        fNum = 3.14f;
        dNum = -3.14;

        ch = 'a';

        int kor = 90;
        int math = 80;
        int eng = 87;

        int sum = kor + math + eng;

        System.out.println("sum = " + sum);

        double avg = sum/3.0;
        System.out.println("avg = " + avg);


    }
}

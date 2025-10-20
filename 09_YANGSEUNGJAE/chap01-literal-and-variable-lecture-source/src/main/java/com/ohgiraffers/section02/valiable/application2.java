package com.ohgiraffers.section02.valiable;

public class application2 {
    public static void main(String[] args) {

        byte bNum;
        short sNum;
        int iNum;
        long lNum;

        float fNum;
        double dNum;

        char ch;

        boolean isTure;

        String str;

        bNum = 1;
        sNum = 2;
        iNum = 3;
        lNum = 22222222222222L;

        fNum = 3.14f;
        dNum = -3.14;
        ch = 'a';
        isTure = true;

        str = "가나다라마바사";

        int kor = 90;
        int math = 92;
        int eng = 87;

        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        System.out.println(sum / 3);


        double avg = sum/3.0;
        System.out.println("avg = " + avg);
    }
}

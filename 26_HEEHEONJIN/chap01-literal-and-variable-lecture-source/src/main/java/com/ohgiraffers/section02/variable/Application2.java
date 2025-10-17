package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        // 1. 정수를 취급하는 자료형
        byte bNum;     // 1byte
        short sNum;    // 2byte
        int iNum;      // 4byte
        long lNum;     // 8byte

        // 2. 실수를 취급하는 자료형
        float fNum;   // 4byte
        double dNum;  // 8byte
        // 3. 문자를 취급하는 자료형
        char ch;       // 2byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue; // 1byte

        // 5. 문자열을 취급하는 자료형 (참저 지료형)
        String str;    // 4byte

        // 자료형별 초기화;
        bNum = 1;      // 1byte
        sNum = 2;      // 2byte
        iNum = 3 ;     // 4byte
        lNum = 22000000L; // 8byte

        fNum = 3.24f;
        dNum = -3.14;

        ch = 'a';
        ch = 97;

        isTrue = true;

        int kor = 90;
        int math = 80;
        int eng = 87;

        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        System.out.println(sum /3);
        double avg = sum/3;
        System.out.println("avg = " + avg);
    }
}

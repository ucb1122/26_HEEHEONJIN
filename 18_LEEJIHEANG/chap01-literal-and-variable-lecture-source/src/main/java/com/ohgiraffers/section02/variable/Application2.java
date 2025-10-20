package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        // 1. 정수를 취급하는 자료형
        // 변수를 선언
        byte      bNum;  // 1byte
        short     sNum;  // 2byte
        int       iNum;  // 4byte(default)
        long      lNum;  // 8byte


        // 2. 실수를 취급하는 자료형
        float     fNum;  // 4byte
        double    dNum;  // 8byte

        // 3. 문자를 취급하는 자료형
        char        ch;  // 2byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue;  // 1byte is가 붙어있으면 결과가 거의 boolean. 변수는 중복해서 만들면 안됨.

        // 5. 문자열을 취급하는 자료형
        String     str;  // 4byte
        bNum = 1;
        sNum = 2;
        iNum = 3;
        lNum = 220000000000L;

        fNum = 3.14f;    // double 형으로 인식되는 실수를 float에 담을 때는 f를 붙인다.
        dNum = -3.14;

        ch = 'a';
        ch = 97;         // char는 양수만 가능

        isTrue = true;

        int kor  = 90;
        int math = 80;
        int eng  = 87;

        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        System.out.println(sum/3);

        double avg = sum / 3.0;
        System.out.println("avg = " + avg);
    }
}

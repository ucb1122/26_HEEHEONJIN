package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        // 1. 정수를 취급하는 자료형.
        // 변수를 선언
        byte bNum;          // 1byte
        short sNum;         // 2byte
        int iNum;             // 4byte(default)
        long lNum;          // 8byte

        // 2, 실수를 취급하는 자료형
        float fNum;         // 4byte
        double dNum;     // 8byte

        // 3. 문자를 취급하는 자료형
        char ch;             // 2byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue;  // 1byte

        // 5. 문자열을 취급하는 자료형(참조 자료형)
        String str;          // 4byte

        // 자료형 별로 초기화
        bNum =1;
        sNum = 2;
        iNum = 3;
        lNum = 20000000L; // long형에 대입되는 값은 L을 붙인다.(암묵적으로 l은 L처럼 대문자를 쓴다.)

        fNum = 3.14f; // 실수의 기본은 double형이기 때문에 float에 담을 때는 f로 한다.
        dNum = -3.14;

        ch = 'a';
        ch = 97;

        isTrue = true;

        int kor = 90;
        int math = 80;
        int eng = 87;

        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        System.out.println(sum / 3);

        double avg = sum / 3.0; // 나눗셈은 일반적으로 실수 결과가 나오며 나눌때 항 중에 하나 이상은 실수값이여야한다.
        System.out.println("avg = " + avg);

    }
}

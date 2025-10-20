package com.lhw.section02.variable;

public class Application2 {
    public static void main(String[] args) {
//        1. 정수를 취급하는 자료형
//        변수를 선언
        byte bNum;
        short sNum;
        int iNum;
        long lNum;

//        2. 실수
        float fNum;			  //4byte
        double dNum;		  //8byte

//        3. 문자
        char ch;			    //2byte

//        4. 논리
        boolean isTrue;	//1byte

//        5. 문자열
        String str;			//4byte (엄밀히 이야기 하면 주소값은 4byte 정수형이다.)

//        자료형 별로 초기화
        bNum = 1;
        sNum = 2;
        iNum = 3;
        lNum = 423530L; // 대문자 L 로 많이 씀

        fNum = 3.14f;

        ch = 'a';
        isTrue = true;

        int KOR = 90;
        int math = 80;
        int eng = 87;

        int avg = (KOR + math + eng) / 3;
        System.out.println(avg);

    }

}

package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1o {

    public static void main(String[] args) {
        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         * 문자열을 하나 입력하세요 : helloworld
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
        /* 문자열 클래스에서 제공하는 length(), charAt() */
    Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();
        int count = 0;
        char[] charray = str.toCharArray();
        for ( int i = 0; i < charray.length; i++) {
            if(str.charAt(i) == 'l'){
                count++;
            }
        }
        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 l은 " + count + "개 입니다.");
    }
}

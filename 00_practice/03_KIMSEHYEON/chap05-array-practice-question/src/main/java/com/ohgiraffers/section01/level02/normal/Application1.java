package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        /* 문자열 클래스에서 제공하는 length(), charAt() */
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String s = scanner.nextLine();
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        System.out.print("찾으실 문자를 입력하세요 : ");
        char a = scanner.next().charAt(0);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(arr[i] == a){
                sum++;
            }
        }
        System.out.println("입력하신 문자열" + s + "에서 찾으시는 문자 " + a + "은 " + sum + "개 입니다.");


    }
}

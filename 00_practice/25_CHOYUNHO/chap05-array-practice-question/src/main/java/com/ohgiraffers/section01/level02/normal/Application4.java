package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int a [] = new int[6];
        for(int i=0;i<6;i++){
            int random = (int)(Math.random()*45)+1;

            for(int j=0;j<i;j++){
                while(a[j]==random){
                    random = (int)(Math.random()*45)+1;
                }
            }
            a[i] = random;
        }
        System.out.println(Arrays.toString(a));
    }
}

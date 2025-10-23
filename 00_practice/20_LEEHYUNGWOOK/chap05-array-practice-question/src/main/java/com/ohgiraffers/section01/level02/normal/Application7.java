package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ranarr = new int[10];

        for  (int i = 0; i < ranarr.length; i++) {
            int rannum = (int) (Math.random() * 10) + 1;
            ranarr[i] = rannum;
        }

        for (int num : ranarr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("최대값 : " + Arrays.stream(ranarr).max().getAsInt());
        System.out.println("최소값 : " +  Arrays.stream(ranarr).min().getAsInt());


        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */
    }
}

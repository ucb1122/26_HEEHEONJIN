package com.ohgiraffers.level03;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        *
        *
        * 정수하나를 입력하세요 : 5 ->반복횟수
        *         1 x 8 + 1 = 9
        *        12 x 8 + 2 = 98
        *       123 x 8 + 3 = 987
        *      1234 x 8 + 4 = 9876
        *     12345 x 8 + 5 = 98765
        *
        *
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        * 정수 하나를 입력하세요 : 9
        * */
        //Math.pow(밑, 지수)
        //System.out.printf("\s"); 하면 스페이스바 한번이야
        Scanner sc = new Scanner(System.in);

        //double a = 1.23456789;
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        int a = 0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.printf("\s");
            }
            a += i;
            System.out.println(a + " x " + 8 + " + " + i + " = " + (a*8+i));
            a*=10;
        }
    }
}

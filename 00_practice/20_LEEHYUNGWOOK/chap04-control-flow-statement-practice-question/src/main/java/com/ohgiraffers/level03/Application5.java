package com.ohgiraffers.level03;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하시오 : ");
        int num = sc.nextInt();

        for  (int i = 1; i <= num; i++) {
            System.out.print("    "); // 시작 띄우기
            for (int k = 1; k <= num-i; k++) { // 오르막 숫자 계단 공백
                System.out.print(" ");
            }
            for  (int l = 1; l <= num-(num-i); l++) { // 오르막 숫자 계단
                System.out.print(l);
            }
            System.out.print(" x 8 + ");
            System.out.print(i); // x 8 + (숫자)
            System.out.print(" = "); // = 부등호
            for  (int l = 9; l >= 9-(i-1); l--) { // 내리막 숫자 계단
                System.out.print(l);
            }
            for (int k = 1; k <= num-i; k++) { // 내리막 숫자 계단 공백
                System.out.print(" ");
            }

            System.out.println();
        }


        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        *
        *
        * 정수하나를 입력하세요 : 5
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
    }
}

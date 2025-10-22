package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

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
        *  정수하나를 입력하세요 : 9
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나를 입력하세요 : ");
        int num = sc.nextInt();
        printNumberCoolness(num);

    }

    public static void printSpaces(int nSpaces) {
        for (int i = 0; i < nSpaces; i++) {
            System.out.print(" ");
        }
    }

    public static void printNumberCoolness(int num) {
        int sum = 0;
        int result = 0;
        int space = num;
        for (int count = 1; count <= num; count++) {
            printSpaces(space--);
            sum = sum * 10 + 1;
            result = result + sum;
            System.out.println(result + " x 8 + " + count + " = " + (result * 8 + count));
        }
    }

}

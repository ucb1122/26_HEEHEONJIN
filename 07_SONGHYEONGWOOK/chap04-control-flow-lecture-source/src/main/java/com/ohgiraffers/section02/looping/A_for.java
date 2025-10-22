package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    // 1(초기식)부터 10(조건식)까지 1씩 증가(증감식)시키면서 i값을 출력하는 기본 반복문
    // for(1부터;10까지;1씩증가) {
    // 1부터 10까지 반복하며 출력
    // }
    public void testSimpleForStatement() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }
    public void test1() {

    Scanner sc = new Scanner(System.in);
    System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
    String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");

        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
    String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");

        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
    String student3 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");

        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
    String student4 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");

        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
    String student5 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");

        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
    String student6 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");

        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
    String student7 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");

        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
    String student8 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");

        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
    String student9 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");

        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
    String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");

        /*
         * 반복횟수 : 총 10번
         * 시작값은 : 0 or 1 알아서 시작
         * 1. 안내문구 출력
         * 2. 학생 이름을 입력받아 변수에 저장
         * 3. 저장된 이름을 출력
         */
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void test2() {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        System.out.println("sum = " + sum);

        /*
         * 반복할 횟수 : 10번, 초기식 : 1
         * 반복해야할 내용 :
         * 1. 변수에 1씩 증가하는 값을 담기
         * 2. 저장된 값을 sum에 누적시키기
         */
        int sum2 = 0;
        for(int i = 1; i < 11; i++) {
            sum2 += i;
        }

    }
}

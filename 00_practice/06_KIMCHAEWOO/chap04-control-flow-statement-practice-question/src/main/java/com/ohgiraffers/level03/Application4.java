package com.ohgiraffers.level03;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        *  합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        *  (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        *  합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        *  불합격인 경우에는 “불합격입니다.”를 출력하세요.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 입력: ");
        int kor = sc.nextInt();
        System.out.print("영어 입력: ");
        int eng = sc.nextInt();
        System.out.print("수학 입력: ");
        int math = sc.nextInt();

        if ((kor + eng + math) / 3 >= 60) {
            if (kor < 40) {
                System.out.println("국어 점수 미달 불합격");
            } else if (eng < 40) {
                System.out.println("영어 점수 미달 불합격");
            } else if (math < 40) {
                System.out.println("수학 점수 미달 불합격");
            } else {
                System.out.println("합격");
                System.out.println("kor = " + kor);
                System.out.println("eng = " + eng);
                System.out.println("math = " + math);
                System.out.println("avg = " + (kor+eng+math)/3);
                System.out.println("sum = " + (kor+eng+math));
            }
        } else {
            System.out.println("평균점수 미달로 불합격");
        }
    }
}

package com.ohgiraffers.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 키는? (미터)");
        double height = sc.nextDouble();
        System.out.println("당신의 몸무게는? (kg)");
        int weight = sc.nextInt();

        int bmi = (int) (weight / (height * height));

        if (bmi < 20) {
            System.out.println("당신은 저체중..");
        } else if(bmi >= 20 && bmi < 25){
            System.out.println("당신은 정상체중..!");
        } else if(bmi >= 25 && bmi < 30){
            System.out.println("당신은 과체중..");
        } else {
            System.out.println("당신은 비만.. 위험해..");
        }
    }
}

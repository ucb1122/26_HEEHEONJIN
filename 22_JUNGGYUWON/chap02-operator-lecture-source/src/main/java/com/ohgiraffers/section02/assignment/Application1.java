package com.ohgiraffers.section02.assignment;

import javax.lang.model.SourceVersion;

public class Application1 {

    public static void main(String[] args) {

        int num = 12;
        System.out.println("num = " + num);
        
        num =  num + 3;  // 공간(num) = 값(num) + 3
        System.out.println("num = " + num);
        
        num += 3;
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num); // 13

        num *= 2; // num = num * 2
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);
        
        // 주의
        num =- 5;  // equal(=)기호 오른쪽은 복합 대입연산자가 아니다.
        System.out.println("num = " + num);
    }
}

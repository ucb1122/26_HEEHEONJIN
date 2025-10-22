package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void testifElseifStatement(){
        Scanner sc=new Scanner(System.in);

        System.out.print("학생 이름: ");
        String name=sc.nextLine();
        System.out.print("학생 성적: ");
        int score=sc.nextInt();

        String grade = "";

        if(score >= 90){
            grade = "A";
            //String grade = "A";
        }else if(score >= 80){
            grade = "B";
        }else if(score >= 70){
            grade = "C";
        }else if(score >= 60){
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println(name + "학생의 점수는 " + score + "점이며 학점은 " + grade+ "입니다.");
    }
    public void testNestedifElseifStatement(){
        Scanner sc=new Scanner(System.in);

        System.out.print("학생 이름: ");
        String name=sc.nextLine();
        System.out.print("학생 성적: ");
        int score=sc.nextInt();

        String grade = ""; // 학생 성적 저장을 위한 변수 선언 및 초기화

        if(score >= 90){
            grade = "A";
            if (score >= 95) {
                grade = "A+";
            }
        }else if(score >= 80){
            grade = "B";
            if (score >= 85) grade += "+";
        }else if(score >= 70){
            grade = "C";
            if (score >= 75) grade += "+";

        }else if(score >= 60){
            grade = "D";
            if (score >= 65) grade += "+";

        }else{
            grade = "F";
        }

        //참고
        if(score == 100 || (score%10>=5 && score >60)){
            grade += "+";
        }
        System.out.println(name + "학생의 점수는 " + score + "점이며 학점은 " + grade+ "입니다.");
    }


}

package com.rlatjddms.hw2.run;

import com.rlatjddms.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[] students = new StudentDTO[10];
        int count = 0;

        while (count < 10) {
            System.out.print("학년 입력 : ");
            int grade = sc.nextInt();
            System.out.print("반 입력 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 입력 : ");
            String name = sc.next();
            System.out.print("국어점수 입력 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 입력 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 입력 : ");
            int math = sc.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.print("계속 추가하시겠습니까? (y/n) : ");
            char choice = sc.next().charAt(0);
            if(choice != 'y' && choice != 'Y') break;
        }

        for(int i = 0; i < count; i++){
            System.out.println(students[i].information());
        }
    }
}

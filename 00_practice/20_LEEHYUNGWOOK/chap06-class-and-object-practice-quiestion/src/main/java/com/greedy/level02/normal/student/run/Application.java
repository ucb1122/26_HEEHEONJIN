package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력하시오 : ");

        int grade = sc.nextInt();
        int classroom = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double height = sc.nextDouble();
        char gender = sc.next().charAt(0);

        StudentVO student = new StudentVO(grade, classroom, name, height, gender);
        student.printInformation();
    }
}

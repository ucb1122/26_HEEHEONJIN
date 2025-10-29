package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        StudentDTO[] studentDTO = new StudentDTO[3];
        EmployeeDTO[] employeeDTO = new EmployeeDTO[10];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        studentDTO[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        studentDTO[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        studentDTO[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (StudentDTO sDTO : studentDTO) {
            System.out.println(sDTO.information());
        }

        while (true) {

            System.out.print("이름 : ");
            String name =  sc.nextLine();

            System.out.print("나이 : ");
            int age = sc.nextInt();

            System.out.print("신장 : ");
            double height = sc.nextDouble();

            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();

            System.out.print("급여 : ");
            int salary = sc.nextInt();

            System.out.print("부서 : ");
            String dept =  sc.next();

            System.out.print("계속 추가 하시겠습니까? ");
            char answer =  sc.next().charAt(0);

            employeeDTO[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            if (answer == 'y' ||  answer == 'Y') {
                continue;
            } else { break; }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employeeDTO[i].information());
        }
    }
}

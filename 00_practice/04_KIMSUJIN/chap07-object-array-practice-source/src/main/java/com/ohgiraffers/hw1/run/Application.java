package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        EmployeeDTO [] empArr = new EmployeeDTO[3];
        System.out.println(Arrays.toString(empArr));
        System.out.println("===================================");

        empArr[0] = new EmployeeDTO();
        empArr[1] =  new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 마곡" );
        empArr[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡 ");

        for(EmployeeDTO emp : empArr){
            System.out.println(emp.Information());
        }
        System.out.println("===================================");
        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        empArr[0] = new EmployeeDTO( 0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        empArr[1] = new EmployeeDTO( 1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println(empArr[0].Information());
        System.out.println(empArr[1].Information());

        System.out.println("===================================");

        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        //김말똥씨
        int sumSalary = 0;
        for(int i = 0; i < empArr.length; i++){
            int salary = empArr[i].getSalary();
            double bonus = empArr[i].getBonusPoint();
            int annSal = (int) (salary + (salary * bonus)) * 12;
            sumSalary += annSal;
            String name = empArr[i].getEmpName();
            System.out.println(name + "의 연봉: " + annSal + "원");
        }

        // 3명의 직원의 연봉 평균을 구하여 출력
        int avgAnnulSalary =  sumSalary / empArr.length;
        System.out.println("직원들의 연봉의 평균 : " + avgAnnulSalary + "원");


    }
}

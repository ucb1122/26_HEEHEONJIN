package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section02.package_and_import.test.Calculator;

//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//import static com.ohgiraffers.section01.method.Calculator.minNumberOf;
import static com.ohgiraffers.section01.method.Calculator.*;

public class Application2 {
    public static void main(String[] args) {

        // non-static-method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 = Calculator.maxNumberOf(10, 20);
        System.out.println("result2 = " + result2);

        int result3 = maxNumberOf(10,20);
        System.out.println("result3 = " + result3);
        int result4 = minNumberOf(10,20);

        com.ohgiraffers.section01.method.Calculator cal2
                = new com.ohgiraffers.section01.method.Calculator();


    }
}

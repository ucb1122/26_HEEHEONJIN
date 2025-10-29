package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            // 상품 가격이 음수일 경우
            et.checkEnoughMoney(-20000, 10000);
        } catch (PriceNegativeException e) {
            e.printStackTrace();
        }
    }
}

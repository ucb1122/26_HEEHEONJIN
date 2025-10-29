package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException {

        if(price < 0){
            /* throw를 이용해서 이부분에서 강제로 예외를 발생시킴*/
            throw new PriceNegativeException("상품 가격은 음수 일 수 없습니다.");
        }
        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요~~~");
    }
}

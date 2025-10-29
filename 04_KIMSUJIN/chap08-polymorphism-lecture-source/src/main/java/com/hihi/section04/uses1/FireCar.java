package com.hihi.section04.uses1;

import com.hihi.section03.interfaceimplements.InterProduct;

public class FireCar extends Car implements Soundable {

    @Override
    public void horn() {
        System.out.println("소방차가 나갑니다. 다들 비키세요!");
    }

    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다");
    }
}

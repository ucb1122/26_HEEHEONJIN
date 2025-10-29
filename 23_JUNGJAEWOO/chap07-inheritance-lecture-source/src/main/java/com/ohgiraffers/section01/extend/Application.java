package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {
        /* 부모 클래스 */
        Car car = new Car();

        /*
         * 상속은 IS-A 관계로 구분되는 경우에만 사용해야 한다.
         * 삼각형은 도형이다(O)
         * 도형은 삼각형이다.(X)
         *
         * 소방차, 레이싱카, 모두 자동차이다. (O)
         * 모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카이다. (X)
         * */
        System.out.println("================ FireCar ===================");
        FireCar fireCar = new FireCar();

        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.sprayWater();

        System.out.println("================ RacingCar ===================");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.stop();


    }

}

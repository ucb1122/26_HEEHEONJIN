package com.lhw.section01.extend;

public class Car {

    private boolean runningStatus;  // 자동차의 달리는 상태값

    public Car() {
        super(); // -> 모든 클래스는 Object 클래스로부터 상속 받는다.
        System.out.println("Car 클래스 기본생성자 호출됨");
    }

    public void run () {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn() {
        if (isRunning()){
            System.out.println("경적📣📣");
        } else {
            System.out.println("주행 중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }
    }

    protected boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}

package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    /*
    * Car 클래스의 모든 멤버(필드, 메소드)를 상속 가능
    * 단, 생성자는 상속 불가
    * */
    public FireCar() {
        /*
        * 모든 생성자 맨 첫 줄에 super()를 컴파일러가 자동으로 추가
        * 부모의 기본 생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용 가능
        * */
        super();
        System.out.println("FireCar 클래스 기본 생성자 작동 확인");
    }

    /*
    * soundHorn 메소드 재작성 : overriding
    * @Override 어노테이션 : 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러 발생
    * */

    @Override
    public void soundHorn() {
        /*
        * private 접근 제어자가 붙은 필드는 상속은 받지만 자식은 접근 불가
        * protected로 변경 시 자식은 접근 가능
        */
        if(isRunning()){
            System.out.println("‼️‼️‼️‼️‼️");
        } else {
            System.out.println("🔇🔇🔇🔇🔇");
        }
    }

    /*
    * 상속은 자식 클래스가 부모 클래스를 확장하는 것
    * FireCar만의 추가 기능도 작성 가능
    * */

    public void sprayWater() {
        System.out.println("🌊🌊🌊🌊🌊");
    }
}

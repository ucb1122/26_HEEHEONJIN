package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        Tiger[] tarr = new Tiger[3]; //tiger만! 들어갈 수 있음
        Rabbit[] rarr = new Rabbit[3]; //rabbit만! 들어갈 수 있음

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit(); // 다형성 (업캐스팅)
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Rabbit();
        animals[4] = new Tiger();

        //Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시 동적바인딩을 이용하여 출력
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
        for (int i = 0; i < tarr.length; i++) {
            if (animals[i] instanceof Rabbit) {
                ((Rabbit) animals[i]).jump();
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).bite();
            } else{
                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }

    }
}

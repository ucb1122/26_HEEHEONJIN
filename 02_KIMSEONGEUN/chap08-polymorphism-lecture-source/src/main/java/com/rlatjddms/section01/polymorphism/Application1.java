package com.rlatjddms.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 다형성
        *    다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미한다.
        * */
        System.out.println("Animal 생성 ====================");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Tiger 생성 ====================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println("Rabbit 생성 ====================");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        /*
        * Rabbit과 Tiger는 Animal클래스를 상속받았다.
        *
        * Rabbit은 Rabbit 타입이기도 하면서 Animal타입이기도 하다.
        * Tiger는 Tiger타입이기도 하면서 Animal타입이기도 하다.
        * */

        /* 부모 타입으로 자식 인스턴스 주소값 저장 */
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        /* Animal은 Animal 타입이지 Tiger나 Rabbit이 아니다. */
//        Rabbit rabbit1 = new Animal();
//        Tiger tiger1 = new Animal();

        System.out.println("동적 바인딩 ===========================");
        animal1.cry();
        animal2.cry();

        /* 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여
        * Rabbit과 Tiger로 변경해야 메소드 호출이 가능하다.
        * class type casting : 클래스 형변환
        * ===> 타입 형변환시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException 이 발생할 수 있다.
        * */
        System.out.println("클래스타입 형변환 확인 ==================");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();

//        ((Tiger) animal1).bite();
        /*
        * instanceof 연산자 이용
        * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        * */
        System.out.println("instanceof 확인 =======================");
        System.out.println("animal1이 Tiger 타입인지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 타입인지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal 타입인지 확인 : " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object 타입인지 확인 : " + (animal1 instanceof Object));

        if(animal1 instanceof Rabbit){
            ((Rabbit) animal1).jump();
        }

        if(animal1 instanceof Tiger){
            ((Tiger) animal1).bite();
        }

        /* 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        * up-casting: 상위 타입으로 형변환
        * down-casting: 하위 타입으로 형변환
        * 또한 작성여부에 따라 명시적과 묵시적 두가지로 구분된다.
        * */
        Animal animal3 = (Animal) new Rabbit();  // 업캐스팅(명시적 형변환)
        System.out.println(animal3 instanceof Animal);
        System.out.println(animal3 instanceof Rabbit);
        Animal animal4 = new Rabbit();           // 업캐스팅(묵시적 형변환)

        Rabbit rabbit1 = (Rabbit) animal3;       // Animal -> Rabbit 다운캐스팅
                                                 // 명시적 형변환
//        Rabbit rabbit2 = animal3;              // 다운캐스팅 묵시적 형변환 안된다
    }
}

package com.sekong.section06.singleton;

public class Application {
    public static void main(String[] args) {
        // 싱글톤 구현 방법
        // 1. 이른 초기화 (Eager Initialization)
        // 2. 늦은 초기화 (Lazy Ininitalization)

        /*
         * singleton pattern 이란
         * 애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고 그 메모리에 인스턴스를
         * 만들어서 하나의 인스턴스를 공유해서 사용하며 메모리 낭비를 방지할 수 있게한다.
         * (매번 인스턴스 생성 하지 않는다.)
         * 장점
         *   1. 첫 번째 이용시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
         *      두 번째 이용시에는 인스턴스 생성 시간 없이 사용할 수 있다.
         *   2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.
         * 단점
         *   1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
         *      (유지보수와 테스트에 문제점이 있다)
         *   2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
         * */
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();

        System.out.println("singleton1: "+ s1.hashCode());
        System.out.println("singleton2: "+ s2.hashCode());

        LazySingleton s3 = LazySingleton.getInstance();
        LazySingleton s4 = LazySingleton.getInstance();

        System.out.println("lazysingleton3: "+ s3.hashCode());
        System.out.println("lazysingleton4: "+ s4.hashCode());

    }
}

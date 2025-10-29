package com.ohgiraffers.section03.interfaceimplements;

import com.ohgiraffers.section02.abstractclass.Product;

public interface InterProduct extends java.io.Serializable, java.util.Comparator {

    /* 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 이용하며
    * 이때 여러 인터페이스를 다중 상속받을 수 있다.
    * */

    /* 인터페이스는 상수 필드만 작성 가능하다.
    * [[ public staic final ]] 제어자 조합을 [상수 필드]라고 부른다.
    * */
    public final int MAX_NUM = 100;
    /* 인터페이스는 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로
    * public static final 이다.
    * */
    int MIN_NUM = 10;

    /* 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct(){}
    /* 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
//    public void nonStaticMethod() {};

    /* 인터페이스 안에 작성한 메소드는 묵시적으로 public static abstract의 의미를 가진다.
    * (다른 접근제한자 사용 불가)
    * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우
    * 반드시 접근제한자를 public 으로 해야 오버라이딩이 가능하다.
    * */
    public abstract void nonStaticMethod();
    void nonStaticMethod1();

    /* JDK 1.8 추가된 기능 */
    public static void staticMethod(){
        System.out.println("InterProduct 클래스의 staticMethod 호출됨..");
    }

    /* JDK 1.8 추가된 기능*/
    public default void defaultMethod(){
        System.out.println("InterProduct클래스의 defaultMethod 호출됨..");
    }
}

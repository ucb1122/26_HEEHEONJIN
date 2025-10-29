package com.ogiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount; //인스턴스 변수(인스턴스 당 1개)
    private static int staticCount;// 클래스 변수(클래스 당 1개)

    public void increaseNonStaticCount() {
        /*
        인스턴스 변수는 해당 인스터늣의 주소(this)를 통해 참조해야 한다.
        this.은 생략해도 compiler가 자동으로 생성해주는 구문이다.
         */
        this.nonStaticCount++;
    }

    public void increaseStaticCount(){
        /* 클래스 변수는 해당 클래스를 통해 참조한다. */
        this.staticCount++;
    }

    public int getNonStaticCount(){
        return this.nonStaticCount;
    }

    public static int getStaticCount(){
        /*
        static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드이다.
        따라서 내부에서 this키워드를 사용할 수 없다.
         */
        //return this.staticCount;
        return staticCount;
    }

}

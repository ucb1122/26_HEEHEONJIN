package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해 */

        /*
        * 필드에 직접 접근하면 필드의 변경이 발생하였을때 사용한 모든 코드를 수정해야한다.
        * 이는 유지보수적인 측면에서 악영향을 끼친다.
        * */

        Monster m1 = new Monster();

//        m1.name = "두치";
        m1.setInfo("두치");
        m1.hp = 200;
        System.out.println("m1.name= "+m1.getInfo());
        System.out.println("m1.hp= "+m1.hp);

        Monster m2 = new Monster();
//        m2.name = "뿌꾸";
        m2.hp = -200;
//        System.out.println("m2.name="+m2.name);
        System.out.println("m2.hp= "+m2.hp);

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        /*
        * hp는 음수값일 수 없다. =? 필드에 올바르지 않은 값이 들어가도 통제 불가능한다.
        * 직접 접근을 메소드를 통해서 간접 접근할 수 있도록 수정해본다.
         */

        Monster m3 = new Monster();
//        m3.name = "짱 센 강윤혜";
//        m3.setHp(1000);
//        System.out.println("m3.name="+m3.name);
//        System.out.println("m3.hp="+m3.hp);

    }
}

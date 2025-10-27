package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    /*
    * 접근 제한자
    * 클래스 혹은 클래스의 멤버(필드, 메소드)에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    * public, protected, default, private
    * 단, 클래스 선언 시에는 public, default만 사용 가능
    * */

    /* 필드는 클래스 내부에서만 접근가능하도록 함 */
    private String kinds;
    private int hp;

    /* 간접 접근 가능한 메소드를 정의하여 외부에서는 메소드를 통해  간접 접근하게 함*/
    public void setInfo(String info) {
        this.kinds = info;

    }

    public String getInfo() {
        return this.kinds;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getHp() {
        return this.hp;
    }
}
